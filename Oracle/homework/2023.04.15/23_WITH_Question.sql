--1) WITH 절을 이용하여 정교수만 모여있는 가상테이블 하나와 일반과목(과목명에 일반이 포함되는)들이 모여있는 가상테이블 하나를 생성하여 
--   일반과목들을 강의하는 교수의 정보 조회하세요.(과목번호, 과목명, 교수번호, 교수이름)
WITH PRO AS (SELECT * FROM PROFESSOR WHERE ORDERS = '정교수'),
     CO AS (SELECT * FROM COURSE WHERE CNAME LIKE '%일반%')
SELECT CO.CNO
     , CO.CNAME
     , PRO.PNO
     , PRO.PNAME
    FROM PRO, CO
    WHERE PRO.PNO = CO.PNO;

--2) WITH 절을 이용하여 급여가 3000이상인 사원정보를 갖는 가상테이블 하나와 보너스가 500이상인 사원정보를 갖는 가상테이블 하나를 생성하여
--   두 테이블에 모두 속해있는 사원의 정보를 모두 조회하세요.
WITH ES AS (SELECT * FROM EMP WHERE SAL >= 3000),
     EC AS (SELECT * FROM EMP WHERE COMM >= 500)
SELECT ES.*
    FROM ES, EC
    WHERE ES.ENO = EC.ENO;
                               
--3) WITH 절을 이용하여 평점이 3.3이상인 학생의 목록을 갖는 가상테이블 하나와 학생별 기말고사 평균점수를 갖는 가상테이블 하나를 생성하여
--   평점이 3.3이상인 학생의 기말고사 평균 점수를 조회하세요.
WITH ST AS (SELECT * FROM STUDENT WHERE AVR >= 3.3),
     SC AS (SELECT SNO, AVG(RESULT) AS RESULT FROM SCORE GROUP BY SNO)
SELECT ST.SNO
     , ST.SNAME
     , ST.AVR
     , SC.RESULT
    FROM ST, SC
    WHERE ST.SNO = SC.SNO;

--4) WITH 절을 이용하여 부임일자가 25년이상된 교수정보를 갖는 가상테이블 하나와 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 기말고사성적을
--   갖는 가상테이블 하나를 생성하여 기말고사 성적이 90이상인 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 교수이름, 기말고사성적을 조회하세요.
WITH PO AS (SELECT * FROM PROFESSOR WHERE MONTHS_BETWEEN(SYSDATE, HIREDATE) >= 300),
     SC AS (SELECT CNO, CNAME, SNO, SNAME, PNO, RESULT FROM COURSE NATURAL JOIN SCORE NATURAL JOIN STUDENT)
SELECT SC.CNO
     , SC.CNAME
     , SC.SNO
     , SC.SNAME
     , PO.PNO
     , PO.PNAME
     , SC.RESULT
    FROM SC, PO
    WHERE SC.PNO = PO.PNO
    AND SC.RESULT >= 90;