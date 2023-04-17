--1. 그룹화 관련 함수
--1-1. ROLLUP
--ROLLUP 사용 x
--GROUP BY된 컬럼의 개수로 다 그룹화된 결과
SELECT DNO
     , JOB 
     , MAX(SAL)
     , SUM(SAL)
     , AVG(SAL)
     , COUNT(*)
    FROM EMP
    GROUP BY DNO, JOB;
    
--ROLLUP
--처음에는 그룹화 컬럼 모두에 대한 그룹화진행
--다음부터는 그룹화 컬럼에서 마지막에 있는 컬럼을 하나 씩 제거하고 그룹화 진행
--마지막에는 모든 그룹화 컬럼에 대한 그룹화가 진행되지 않은 전체 데이터에 대한 결과
SELECT DNO
     , JOB 
     , MAX(SAL)
     , SUM(SAL)
     , AVG(SAL)
     , COUNT(*)
    FROM EMP
    GROUP BY ROLLUP(DNO, JOB)
    ORDER BY DNO, JOB;
    
--1-2. CUBE
--CUBE는 ROLLUP과 지정방식이 동일하지만 동작방식이 다르다
--그룹화되는 컬럼들의 모든 조합의 그룹화를 진행하여 결과를 출력
SELECT DNO
     , JOB 
     , MAX(SAL)
     , SUM(SAL)
     , AVG(SAL)
     , COUNT(*)
    FROM EMP
    GROUP BY CUBE(DNO, JOB)
    ORDER BY DNO, JOB;

--1-3. GROUPING SETS
--그룹화로 지정된 컬럼들의 각각의 그룹화를 진행한 결과
SELECT DNO
     , JOB 
     , MAX(SAL)
     , SUM(SAL)
     , AVG(SAL)
     , COUNT(*)
    FROM EMP
    GROUP BY GROUPING SETS(DNO, JOB)
    ORDER BY DNO, JOB;
    
--1-4. 그룹화 함수
--GROUPING
--그룹화 여부 확인
SELECT DNO
     , JOB 
     , MAX(SAL)
     , SUM(SAL)
     , AVG(SAL)
     , COUNT(*)
     , GROUPING(DNO)
     , GROUPING(JOB)
    FROM EMP
    GROUP BY ROLLUP(DNO, JOB)
    ORDER BY DNO, JOB;

--GROUPING_ID
--GROUPING의 결과를 이진수로 인식하여 십진수로 변환한 값을 표시
SELECT DNO
     , JOB 
     , MAX(SAL)
     , SUM(SAL)
     , AVG(SAL)
     , COUNT(*)
     , GROUPING(DNO)
     , GROUPING(JOB)
     , GROUPING_ID(DNO, JOB)
    FROM EMP
    GROUP BY ROLLUP(DNO, JOB)
    ORDER BY DNO, JOB;

--1-5. LISTAGG
--LISTAGG 사용 x
SELECT DNO
     , ENAME
    FROM EMP
    GROUP BY DNO, ENAME;
    
--LISTAGG 사용
--그룹화된 컬럼에 속한 데이터 확인
SELECT DNO
     , LISTAGG(ENAME, ', ')
       WITHIN GROUP(ORDER BY SAL DESC)
    FROM EMP
    GROUP BY DNO;

--1-6. PIVOT
--PIVOT 사용 x
SELECT JOB
     , MAX(SAL)
    FROM EMP
    GROUP BY JOB;

--조회되는 행의 데이터를 컬럼으로 사용할수 있는 PIVOT
SELECT *
    FROM (
            SELECT JOB 
                 , SAL
                FROM EMP
         )
PIVOT(MAX(SAL)
    FOR JOB IN (
                    '경영' AS OPER,
                    '지원' AS HELP,
                    '개발' AS DEV,
                    '회계' AS ACCOUNT,
                    '분석' AS ANALYS
                )
);

--PIVOT 사용
SELECT *
    FROM (
            SELECT JOB
                 , DNO
                 , SAL
                FROM EMP
         )
PIVOT(MAX(SAL)
    FOR JOB IN (
                    '경영' AS OPER,
                    '지원' AS HELP,
                    '개발' AS DEV,
                    '회계' AS ACCOUNT,
                    '분석' AS ANALYS
                )
)
ORDER BY DNO;

--학과별 학년별 평점의 최대값=> 학과가 컬럼으로 변경되는 쿼리
--PIVOT의 메인 FROM절은 사용할 컬럼만 가져올 수 있도록 서브쿼리로
--테이블을 재구성하던가 사용할 컬럼만 가지고 있는 테이블을 create table로 새로 만들어서 사용
SELECT *
    FROM (
            SELECT MAJOR
                 , SYEAR
                 , AVR
                FROM STUDENT
         )
    --통계함수를 사용했는데 GROUP BY가 없는 이유는
    --데이터들이 컬럼이 되면서 컬럼은 중복으로 존재할 수 없기때문에
    --자동으로 그룹화된다.
    PIVOT(MAX(AVR)
        FOR SYEAR IN (
                        1 AS "1",
                        2 AS "2"
                     )
    );

--1-7. UNPIVOT
--UNPIVOT 사용 x
SELECT *
    FROM (
            SELECT MAX(DECODE(JOB, '경영', SAL)) AS "경영"
                 , MAX(DECODE(JOB, '지원', SAL)) AS "지원"
                 , MAX(DECODE(JOB, '회계', SAL)) AS "회계"
                 , MAX(DECODE(JOB, '개발', SAL)) AS "개발"
                 , MAX(DECODE(JOB, '분석', SAL)) AS "분석"
                FROM EMP
         );

--UNPIVOT 사용
SELECT *
    FROM (
            SELECT MAX(DECODE(JOB, '경영', SAL)) AS "경영"
                 , MAX(DECODE(JOB, '지원', SAL)) AS "지원"
                 , MAX(DECODE(JOB, '회계', SAL)) AS "회계"
                 , MAX(DECODE(JOB, '개발', SAL)) AS "개발"
                 , MAX(DECODE(JOB, '분석', SAL)) AS "분석"
                FROM EMP
         )
    UNPIVOT(
        SAL FOR JOB IN ("경영", "지원", "회계", "개발", "분석")
    );

SELECT *
    FROM (
            SELECT DNO
                 , MAX(DECODE(JOB, '경영', SAL)) AS "경영"
                 , MAX(DECODE(JOB, '지원', SAL)) AS "지원"
                 , MAX(DECODE(JOB, '회계', SAL)) AS "회계"
                 , MAX(DECODE(JOB, '개발', SAL)) AS "개발"
                 , MAX(DECODE(JOB, '분석', SAL)) AS "분석"
                FROM EMP
                GROUP BY DNO
         )
    UNPIVOT(
        SAL FOR JOB IN ("경영", "지원", "회계", "개발", "분석")
    );

--UNPIVOT
--PIVOT된 테이블 구조를 만들어 준다.
SELECT *
    FROM (
            SELECT SYEAR
                 , MAX(DECODE(MAJOR, '물리', AVR)) 물리
                 , MAX(DECODE(MAJOR, '생물', AVR)) 생물
                 , MAX(DECODE(MAJOR, '화학', AVR)) 화학
                FROM STUDENT
                GROUP BY SYEAR
         );
         
--UNPIVOT
SELECT *
    FROM (
            SELECT SYEAR
                 , MAX(DECODE(MAJOR, '물리', AVR)) 물리
                 , MAX(DECODE(MAJOR, '생물', AVR)) 생물
                 , MAX(DECODE(MAJOR, '화학', AVR)) 화학
                FROM STUDENT
                GROUP BY SYEAR
         )
    UNPIVOT(
        AVR FOR MAJOR IN (물리, 생물, 화학)
    )
    ORDER BY MAJOR, SYEAR;
    
--PIVOT으로 과목명을 열로 만들고 과목명에 해당하는 기말고사 성적의 평균값
SELECT *
    FROM (
            SELECT CNAME
                 , RESULT
                FROM SCORE
                NATURAL JOIN COURSE
         )
    PIVOT(AVG(RESULT)
        FOR CNAME IN (
                        '정역학' AS 정역학,
                        '일반화학' AS 일반화학,
                        '양자물리학' AS 양자물리학
                     )
    );

SELECT CNAME
     , AVG(RESULT)
    FROM SCORE
    NATURAL JOIN COURSE
    GROUP BY CNAME;

SELECT *
    FROM (
            SELECT AVG(DECODE(CNAME, '정역학', RESULT)) AS 정역학
                 , AVG(DECODE(CNAME, '일반화학', RESULT)) AS 일반화학
                 , AVG(DECODE(CNAME, '양자물리학', RESULT)) AS 양자물리학
                FROM SCORE
                NATURAL JOIN COURSE
        )
    UNPIVOT(
        RESAVG FOR CNAME IN (정역학, 일반화학, 양자물리학)
    );