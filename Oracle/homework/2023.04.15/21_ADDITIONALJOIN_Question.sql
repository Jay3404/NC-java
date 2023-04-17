--1) 각 과목의 과목번호, 과목명, 담당 교수의 교수번호, 교수명을 검색하라(NATURAL JOIN 사용)
SELECT CNO
     , CNAME
     , PNO
     , PNAME
    FROM COURSE
    NATURAL JOIN PROFESSOR;

--2) 화학과 학생의 기말고사 성적을 모두 검색하라(JOIN USING 사용)
SELECT SNO
     , SNAME
     , MAJOR
     , RESULT
    FROM STUDENT
    JOIN SCORE
    USING (SNO);

--3) 화학 관련 과목을 강의하는 교수의 명단을 검색한다(NATURAL JOIN 사용)
SELECT PNO
     , PNAME
     , CNAME
    FROM PROFESSOR
    NATURAL JOIN COURSE
    WHERE CNAME LIKE '%화학%';

--4) 화학과 1학년 학생의 기말고사 성적을 검색한다(NATURAL JOIN 사용)
SELECT SNO
     , SYEAR
     , SNAME
     , RESULT
    FROM STUDENT
    NATURAL JOIN SCORE
    WHERE SYEAR = 1
    AND MAJOR = '화학';

--5) 일반화학 과목의 기말고사 점수를 검색한다(JOIN USING 사용)
SELECT CNAME
     , RESULT
    FROM COURSE
    JOIN SCORE
    USING (CNO)
    WHERE CNAME = '일반화학';

--6) 화학과 1학년 학생이 수강하는 과목을 검색한다(NATURAL JOIN 사용)
SELECT SNO
     , SNAME
     , SYEAR
     , MAJOR
     , CNAME
    FROM STUDENT
    NATURAL JOIN COURSE
    WHERE SYEAR = 1
    AND MAJOR = '화학';