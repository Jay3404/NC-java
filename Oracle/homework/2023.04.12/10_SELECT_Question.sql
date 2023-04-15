--1) 학생중에 동명이인을 검색한다
SELECT DISTINCT S.SNO 학번
    , S.SNAME 학생이름
    FROM STUDENT S
    JOIN STUDENT ST
    ON S.SNAME = ST.SNAME
    AND S.SNO != ST.SNO
    ORDER BY S.SNAME;
--(JOIN ON)-> 다른 테이블을 불러올 때 쓰는 것, 
-- WHERE -> 표 하나 불러와서 바로 조건문 확인할 때나,
-- JOIN을 쓰고 젤 마지막에 조건을 확인할 때 많이 씀 
--2) 전체 교수 명단과 교수가 담당하는 과목의 이름을 학과 순으로 검색한다
SELECT P.*
    , C.CNO
    , C.CNAME
    FROM PROFESSOR P
    JOIN COURSE C
    ON P.PNO = C.PNO
    ORDER BY P.SECTION;

--3) 이번 학기 등록된 모든 과목과 담당 교수의 학점 순으로 검색한다
SELECT C.*
    , P.PNAME
    , P.SECTION
    FROM PROFESSOR P
    LEFT JOIN COURSE C
    ON P.PNO = C.PNO
    ORDER BY C.ST_NUM;
