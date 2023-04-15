--1) 화학과를 제외하고 학과별로 학생들의 평점 평균을 검색하세요
SELECT MAJOR
     , AVG(AVR) AS AVR
    FROM STUDENT
    GROUP BY MAJOR
    HAVING MAJOR != '화학';

--2) 화학과를 제외한 각 학과별 평균 평점 중에 평점이 2.0 이상인 정보를 검색하세요
SELECT MAJOR
     , AVG(AVR) AS AVR
    FROM STUDENT
    GROUP BY MAJOR
    HAVING MAJOR != '화학'
    AND AVG(AVR) >= 2.0;

--3) 기말고사 평균이 60점 이상인 학생의 정보를 검색하세요
SELECT SNO
     , ROUND(AVG(RESULT),2)
    FROM SCORE
    GROUP BY SNO
    HAVING AVG(RESULT) > 60;

--4) 강의 학점이 3학점 이상인 교수의 정보를 검색하세요
SELECT PNO
     , SUM(ST_NUM)
    FROM COURSE
    GROUP BY PNO
    HAVING SUM(ST_NUM) >= 3
    AND PNO IS NOT NULL;

--5) 기말고사 평균 성적이 핵 화학과목보다 우수한 과목의 과목명과 담당 교수명을 검색하세요
SELECT AVRT.CNAME
     , AVRT.CNO
     , P.PNO
     , P.PNAME
     , AVRT.RESULT
    FROM PROFESSOR P
    JOIN (
            SELECT CO.CNAME AS CNAME
                 , CO.CNO AS CNO
                 , CO.PNO AS PNO
                 , SC.RESULT AS RESULT
                FROM COURSE CO
                JOIN (
                        SELECT CNO
                             , AVG(RESULT) AS RESULT
                            FROM SCORE
                            GROUP BY CNO
                    ) SC
                ON SC.CNO = CO.CNO
            ) AVRT
    ON P.PNO = AVRT.PNO
    WHERE AVRT.RESULT > 50.49;

--6) 근무 중인 직원이 4명 이상인 부서를 검색하세요
SELECT D.DNO
     , D.DNAME
     , E.C
    FROM DEPT D
    JOIN (
            SELECT DNO
                 , COUNT(*) AS C
                FROM EMP
                GROUP BY DNO
                HAVING COUNT(*) >= 4
         ) E
    ON D.DNO = E.DNO;

--7) 업무별 평균 연봉이 3000 이상인 업무를 검색하세요
SELECT JOB
     , ROUND(AVG(SAL),2)
    FROM EMP
    GROUP BY JOB
    HAVING AVG(SAL) >= 3000;

--8) 각 학과의 학년별 인원중 인원이 5명 이상인 학년을 검색하세요
SELECT S.MAJOR
     , ST.SYEAR
     , COUNT(*)
    FROM STUDENT S
    JOIN (
            SELECT SYEAR
                 , COUNT(*) AS CO
                FROM STUDENT 
                GROUP BY SYEAR
         ) ST
    ON S.SYEAR = ST.SYEAR
    GROUP BY S.MAJOR, ST.SYEAR
    HAVING COUNT(*) >= 5
    ORDER BY S.MAJOR;