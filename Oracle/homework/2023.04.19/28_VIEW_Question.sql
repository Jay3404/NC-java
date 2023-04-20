--뷰 이름은 자유
--1) 학생의 학점 4.5 만점으로 환산된 정보를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_AVG_SCORE(
    SNO
    , SNAME
    , AVGRESULT
) AS (
    SELECT SNO
         , SNAME
         , AVR * 4.5 / 4.0
        FROM SCORE
        NATURAL JOIN STUDENT
);

--2) 각 과목별 평균 점수를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_AVG_SCORE(
    CNO,
    CNORESULT
) AS (
        SELECT CNO
             , AVG(RESULT)
             FROM SCORE
             NATURAL JOIN COURSE
             GROUP BY CNO

);

--3) 각 사원과 관리자의 이름을 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_ENAME_MGRNAME_EMP(
    ENAME,
    MGRNAME
) AS (
        SELECT A.ENAME
             , B.ENAME
            FROM EMP A
            LEFT JOIN EMP B
            ON A.MGR = B.ENO
);

--4) 각 과목별 기말고사 평가 등급(A~F)까지와 해당 학생 정보를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_GRADE_STUDENT(
    SNO,
    SNAME,
    RESULT,
    GRADE
) AS (
        SELECT ST.SNO
             , ST.SNAME
             , SC.RESULT
             , SG.GRADE
            FROM STUDENT ST
            JOIN SCORE SC
            ON ST.SNO = SC.SNO
            JOIN SCGRADE
            ON RESULT BETWEEN LOSCORE AND HISCORE
);

--5) 물리학과 교수의 과목을 수강하는 학생의 명단을 검색할 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_COURSE_PHYPRO(
    SECTION,
    PNAME,
    CNAME,
    SNO,
    SNAME
) AS (
        SELECT SECTION
             , PNAME
             , CNAME
             , SNO
             , SNAME
            FROM PROFESSOR
            NATURAL JOIN COURSE
            NATURAL JOIN SCORE
            NATURAL JOIN STUDENT
            WHERE SECTION = '물리'
);