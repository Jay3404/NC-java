--1) 다음 구조를 갖는 테이블을 생성하세요.
--PRODUCT 테이블 - PNO NUMBER PK              : 제품번호
--                PNAME VARCHAR2(50)          : 제품이름
--                PRI NUMBER                  : 제품단가
--PAYMENT 테이블 - MNO NUMBER PK              : 전표번호
--               PDATE DATE NOT NULL         : 판매일자
--                CNAME VARCHAR2(50) NOT NULL : 고객명
--                TOTAL NUMBER TOTAL > 0      : 총액
--PAYMENT_DETAIL - MNO NUMBER PK FK           : 전표번호
--                PNO NUMBER PK FK            : 제품번호
--                AMOUNT NUMBER NOT NULL      : 수량
--                PRICE NUMBER NOT NULL       : 단가
--                TOTAL_PRICE NUMBER NOT NULL TOTAL_PRICE > 0 : 금액

CREATE TABLE PRODUCT(
    PNO NUMBER PRIMARY KEY,
    PNAME VARCHAR2(50),
    PRI NUMBER
);

CREATE TABLE PAYMENT(
    MNO NUMBER PRIMARY KEY,
    PDATE DATE NOT NULL,
    CNAME VARCHAR2(50) NOT NULL,
    TOTAL NUMBER CHECK(TOTAL > 0)
);

CREATE TABLE PAYMENT_DETAIL(
    MNO NUMBER,
    PNO NUMBER,
    AMOUNT NUMBER NOT NULL,
    PRICE NUMBER NOT NULL,
    TOTAL_PRICE NUMBER NOT NULL CHECK(TOTAL_PRICE > 0),
    CONSTRAINT PK_DATAIL_MNO_PNO PRIMARY KEY(MNO, PNO),
    CONSTRAINT FK_DETAIL_MNO FOREIGN KEY(MNO)
            REFERENCES PAYMENT(MNO),
    CONSTRAINT FK_DETAIL_PNO FOREIGN KEY(PNO)
            REFERENCES PRODUCT(PNO)
);



DECLARE
    TYPE AVG_RESULT_REC IS RECORD(
        CNO COURSE.CNO%TYPE,
        CNAME COURSE.CNAME%TYPE,
        AVG_RESULT SCORE.RESULT%TYPE
    );

    TYPE RESULT_ARRAY IS TABLE OF AVG_RESULT_REC
    INDEX BY PLS_INTEGER;

    IDX NUMBER := 1;
    RESULTARR RESULT_ARRAY;

    

BEGIN
    
    LOOP
        DBMS_OUTPUT.PUT_LINE('--------------------------------------');

        SELECT CNO
             , CNAME
             , NVL(AVGRESULT, '0')
            INTO RESULTARR(IDX).CNO, RESULTARR(IDX).CNAME, RESULTARR(IDX).AVG_RESULT
            FROM (
                    SELECT ROWNO
                         , CNO
                         , CNAME
                         , AVGRESULT
                        FROM (
                                SELECT ROWNUM AS ROWNO
                                     , CNO
                                     , CNAME
                                     , AVGRESULT
                                
                                FROM (
                                    SELECT COURSE.CNO
                                         , COURSE.CNAME
                                         , AVG(RESULT) AS AVGRESULT
                                        
                                        FROM COURSE
                                        LEFT JOIN SCORE
                                        ON COURSE.CNO = SCORE.CNO
                                        GROUP BY COURSE.CNO, COURSE.CNAME
                                        ORDER BY CNO
                                    )
                                )
                    WHERE ROWNO = IDX
        );
        
        DBMS_OUTPUT.PUT_LINE(RESULTARR(IDX).CNO);
        DBMS_OUTPUT.PUT_LINE(RESULTARR(IDX).CNAME);
        DBMS_OUTPUT.PUT_LINE(RESULTARR(IDX).AVG_RESULT);
        IDX := IDX + 1;
        
        
        EXIT WHEN IDX >= 36;
    END LOOP;
END;
/