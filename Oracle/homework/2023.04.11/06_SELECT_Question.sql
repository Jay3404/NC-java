--1) 유공과와 생물과, 식영과 학생을 검색하라
SELECT *
    FROM STUDENT
    WHERE MAJOR = '유공'
    OR MAJOR = '생물'
    OR MAJOR = '식영';

--2) 화학과가 아닌 학생중에 1학년 학생을 검색하라
SELECT *
    FROM STUDENT
    WHERE MAJOR != '화학'
    AND SYEAR = 1;

--3) 물리학과 3학년 학생을 검색하라
SELECT *
    FROM STUDENT
    WHERE MAJOR = '물리'
    AND SYEAR = 3;

--4) 평점이 2.0에서 3.0사이인 학생을 검색하라
SELECT *
    FROM STUDENT
    WHERE AVR >= 2
    AND AVR <= 3;

--5) 교수가 지정되지 않은 과목중에 학점이 3학점인 과목을 검색하라
SELECT *
    FROM COURSE
    WHERE PNO IS NULL
    AND ST_NUM = 3;

--6) 화학과 관련된 과목중 학점이 2학점 이하인 과목을 검색하라
SELECT *
    FROM COURSE
    WHERE ST_NUM <= 2
    AND CNAME LIKE '%화학%';

--7) 화학과 정교수를 검색하라
SELECT *
    FROM PROFESSOR
    WHERE ORDERS = '정교수'
    AND SECTION = '화학';

--8) 물리학과 학생중에 성이 사마씨인 학생을 검색하라
SELECT *
    FROM STUDENT
    WHERE SNAME LIKE '사마%'
    AND MAJOR = '물리';

--9) 성과 이름이 각각 1글자인 교수를 검색하라
SELECT *
    FROM PROFESSOR
    WHERE PNAME LIKE '__';

