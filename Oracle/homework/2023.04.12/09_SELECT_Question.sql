--1) 송강 교수가 강의하는 과목을 검색한다
SELECT C.CNO
    , C.CNAME
    , P.PNO
    , P.PNAME
    FROM PROFESSOR P
    JOIN COURSE C
    ON P.PNO = C.PNO
    WHERE P.PNAME = '송강';

--2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT C.CNO
    , C.CNAME
    , P.*
    FROM PROFESSOR P
    JOIN COURSE C
    ON P.PNO = C.PNO
    WHERE CNAME LIKE '%화학';
   
--3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT C.CNO
    , C.CNAME
    , C.ST_NUM
    , P.*
    FROM PROFESSOR P
    JOIN COURSE C
    ON P.PNO = C.PNO
    WHERE ST_NUM = 2;
   
  

--4) 화학과 교수가 강의하는 과목을 검색한다
SELECT C.CNO
    , C.CNAME
    , P.*
    FROM PROFESSOR P
    JOIN COURSE C
    ON P.PNO = C.PNO
    WHERE SECTION = '화학';
   
--5) 화학과 1학년 학생의 기말고사 성적을 검색한다
SELECT S.SNO
    , S.SNAME
    ,S.MAJOR
    , S.SYEAR
    , SC.RESULT
    FROM STUDENT S
    JOIN SCORE SC
    ON S.SNO = SC.SNO
    WHERE MAJOR = '화학'
    AND SYEAR = 1;

--6) 일반화학 과목의 기말고사 점수를 검색한다
SELECT C.CNO
    , C.CNAME
    , S.RESULT
    FROM COURSE C
    JOIN SCORE S
    ON C.CNO = S.CNO
    WHERE C.CNAME = '일반화학';
   

--7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다
SELECT S.SNO
    , S.SNAME
    , S.MAJOR
    , S.SYEAR
    , C.CNO
    , C.CNAME
    , SC.RESULT
    FROM STUDENT S
    JOIN SCORE SC
    ON S.SNO = SC.SNO
    JOIN COURSE C
    ON SC.CNO = C.CNO
    WHERE S.MAJOR = '화학'
    AND SYEAR = 1
    AND C.CNAME = '일반화학';
   

--8) 화학과 1학년 학생이 수강하는 과목을 검색한다
SELECT S.SNO
    , S.SNAME
    , S.MAJOR
    , S.SYEAR
    , C.*
    FROM STUDENT S
    JOIN SCORE SC
    ON S.SNO = SC.SNO
    JOIN COURSE C
    ON SC.CNO = C.CNO
    WHERE S.MAJOR = '화학'
    AND SYEAR = 1;

--9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다
SELECT C.CNO
    , C.CNAME
    , SC.RESULT
    , SG.GRADE
    , S.*
    FROM STUDENT S
    JOIN SCORE SC
    ON S.SNO = SC.SNO
    JOIN SCGRADE SG
    ON SC.RESULT BETWEEN LOSCORE AND HISCORE
    JOIN COURSE C
    ON SC.CNO = C.CNO
    WHERE C.CNAME = '유기화학'
    AND SG.GRADE = 'F';

