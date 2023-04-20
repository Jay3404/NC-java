--1) 4.5 환산 평점이 가장 높은 3인의 학생을 검색하세요.
SELECT ROWNUM
     , A.SNO
     , A.SNAME
     , A.AVR
    FROM (
            SELECT AVR * 4.5 / 4.0 AS AVR
                 , SNO
                 , SNAME
                FROM STUDENT
                ORDER BY AVR DESC
    ) A
    WHERE ROWNUM <= 3;

--2) 기말고사 과목별 평균이 높은 3과목을 검색하세요.
SELECT ROWNUM
     , A.CNAME
     , A.RESULT
    FROM (
            SELECT CNAME
                 , AVG(RESULT) AS RESULT
                FROM SCORE
                NATURAL JOIN COURSE
                GROUP BY CNAME
                ORDER BY RESULT DESC
    ) A
    WHERE ROWNUM <= 3;

--3) 학과별, 학년별, 기말고사 평균이 순위 3까지를 검색하세요.(학과, 학년, 평균점수 검색)
SELECT ROWNUM
     , A.MAJOR
     , A.SYEAR
     , A.RESULT
    FROM (
            SELECT MAJOR
                 , SYEAR
                 , AVG(RESULT) AS RESULT
                FROM STUDENT
                NATURAL JOIN SCORE
                GROUP BY MAJOR, SYEAR
                ORDER BY RESULT DESC
    ) A
    WHERE ROWNUM <= 3;

--4) 기말고사 성적이 높은 과목을 담당하는 교수 3인을 검색하세요.(교수이름, 과목명, 평균점수 검색)
SELECT ROWNUM
     , A.PNAME
     , A.CNAME
     , A.RESULT
    FROM (
            SELECT PNAME
                 , CNAME
                 , AVG(RESULT) AS RESULT
                FROM SCORE
                NATURAL JOIN COURSE
                NATURAL JOIN PROFESSOR
                GROUP BY PNAME, CNAME
                ORDER BY RESULT DESC
    ) A
    WHERE ROWNUM <= 3;

--5) 교수별로 현재 수강중인 학생의 수를 검색하세요.
SELECT PNO
     , PNAME
     , COUNT(*)
    FROM COURSE
    NATURAL JOIN SCORE
    NATURAL JOIN PROFESSOR
    GROUP BY PNO, PNAME;

