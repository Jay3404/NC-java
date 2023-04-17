--1. 추가적인 조인 방식
--1-1. NATURAL JOIN
--NATURAL JOIN에서는 조인되는 컬럼에 테이블의 별칭을 달아서 사용할 수 없다.
SELECT SNO
     , st.SNAME
     , AVG(sc.RESULT)
    FROM SCORE sc
    NATURAL JOIN STUDENT st
    GROUP BY SNO, SNAME;
    
--학생별 기말고사 성적의 평균이 55점이상인 학생번호, 학생이름, 기말고사 평균 조회(NATURAL JOIN)
SELECT SNO
     , st.SNAME
     , AVG(sc.RESULT)
    FROM SCORE sc
    NATURAL JOIN STUDENT st
    GROUP BY SNO, SNAME
    HAVING AVG(sc.RESULT) >= 55;
    
--최대 급여가 4000만원 이상되는 부서의 번호, 부서 이름, 급여 조회
SELECT DNO
     , D.DNAME
     , MAX(E.SAL)
    FROM EMP E
    NATURAL JOIN DEPT D
    GROUP BY DNO, D.DNAME
    HAVING MAX(E.SAL) >= 4000;

--1-2. JOIN~USING
--JOIN~ON
SELECT SC.CNO
     , C.CNAME
     , AVG(SC.RESULT)
    FROM SCORE SC
    JOIN COURSE C
    ON SC.CNO = C.CNO
    GROUP BY SC.CNO, C.CNAME
    HAVING AVG(SC.RESULT) >= 53;

--JOIN~USING
SELECT CNO
     , C.CNAME
     , AVG(SC.RESULT)
    FROM SCORE SC
    JOIN COURSE C
    USING (CNO)
    GROUP BY CNO, C.CNAME
    HAVING AVG(SC.RESULT) >= 53;

--학점이 3점인 과목의 교수번호, 교수이름, 과목번호, 과목이름, 학점 조회(JOIN~USING 사용)
SELECT PNO
     , P.PNAME
     , C.CNO
     , C.CNAME
     , C.ST_NUM
    FROM COURSE C
    JOIN PROFESSOR P
    USING (PNO)
    WHERE C.ST_NUM = 3;

--2. 다중 컬럼 IN절
--dno = 01이면서 job이 경영인 사원이나 dno=30이면서 job이 회계인 사원 조회
SELECT DNO
     , ENO
     , ENAME
     , JOB
    FROM EMP
    WHERE (DNO, JOB) IN (('10', '분석'), ('20', '개발'));
    
SELECT DNO
     , ENO
     , ENAME
     , JOB
    FROM EMP
    WHERE (DNO = '10' AND JOB = '분석')
       OR (DNO = '20' AND JOB = '개발');

--잘못 작성한 쿼리
SELECT DNO
     , ENO
     , ENAME
     , JOB
    FROM EMP
    WHERE DNO IN ('10', '20')
      AND JOB IN ('분석', '개발');

SELECT DNO
     , ENO
     , ENAME
     , JOB
    FROM EMP
    WHERE (DNO = '10' AND (JOB = '분석' OR JOB = '개발'))
       OR (DNO = '20' AND (JOB = '분석' OR JOB = '개발'));
     
--다중컬럼 in절(CNO, PNO)을 이용해서 기말고사 성적의 평균이 48점 이상인 
--과목번호 과목명 교수번호 교수이름 기말고사 성적 평균 조회
SELECT CNO
     , C.CNAME
     , PNO
     , P.PNAME
     , AVG(SC.RESULT)
    FROM SCORE SC
    NATURAL JOIN COURSE C
    NATURAL JOIN PROFESSOR P
    WHERE(CNO, PNO) IN (
                         --기말고사 성적의 평균이 48점 이상되는 과목의 CNO, PNO
                         SELECT CNO
                              , PNO
                            FROM SCORE SCC
                            NATURAL JOIN COURSE CC
                            NATURAL JOIN PROFESSOR PP
                            GROUP BY CNO, PNO
                            HAVING AVG(SCC.RESULT) >= 48
                      )
    GROUP BY CNO, C.CNAME, PNO, P.PNAME;

--사원의 정보를 다중 컬럼 IN을 이용해서 조회
--(DNO, MGR) 부서번호는 01, 02 사수번호 0001인 사원번호, 사원이름, 사수번호, 부서번호 조회
SELECT ENO
     , ENAME
     , MGR
     , DNO
    FROM EMP
    WHERE (DNO, MGR) IN (
                            SELECT DNO
                                 , MGR
                                FROM EMP
                                WHERE DNO IN ('01', '02')
                                  AND MGR = '0001'
                         );
                         
--3. WITH
--가상테이블 생성
WITH
    DNO10 AS (SELECT * FROM DEPT WHERE DNO = '10'),
    JOBDEV AS (SELECT * FROM EMP WHERE JOB = '개발')
SELECT JOBDEV.ENO
     , JOBDEV.ENAME
     , JOBDEV.DNO
     , DNO10.DNAME
     , JOBDEV.JOB
    FROM JOBDEV
        , DNO10
    WHERE JOBDEV.DNO = DNO10.DNO;

--화학과 학생명단(STUDENT TABLE의 컬럼 전체), 
--기말고사 성적중 과목명에 화학이 포함되는 성적 정보를 가상 테이블로 생성
--(SCORE의 CNO, SNO, RESULT, COURSE의 CNAME)
--학생별 화학이 포함된 과목의 기말고사 성적의 평균(학생번호, 학생이름, 평균 기말고사성적)
WITH
    CHMIST AS (SELECT * FROM STUDENT WHERE MAJOR = '화학'),
    CHMISC AS (
                  SELECT CNO
                       , C.CNAME
                       , SC.SNO
                       , SC.RESULT
                      FROM SCORE SC
                      NATURAL JOIN COURSE C
                      WHERE C.CNAME LIKE '%화학%'
              )
SELECT SNO
     , CHMIST.SNAME
     , ROUND(AVG(CHMISC.RESULT), 2)
    FROM CHMIST
    NATURAL JOIN CHMISC
    GROUP BY SNO, CHMIST.SNAME;