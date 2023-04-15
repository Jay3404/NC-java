--1) 학생의 평균 평점을 다음 형식에 따라 소수점 이하 2자리까지 검색하세요
--'OOO 학생의 평균 평점은 O.OO입니다.'
SELECT SNAME || '학생의 평균 평점은 '
    || ROUND(AVR, 2) || '입니다.'
    FROM STUDENT;

--2) 교수의 부임일을 다음 형식으로 표현하세요
--'OOO 교수의 부임일은 YYYY년 MM월 DD일입니다.'
SELECT PNAME
     , HIREDATE
     , EXTRACT(YEAR FROM SYSDATE) - CEIL(MONTHS_BETWEEN(SYSDATE, HIREDATE) / 12) || '년 '
    || CEIL(MONTHS_BETWEEN(HIREDATE, TRUNC(HIREDATE, 'YYYY'))) || '월 '
    || (CEIL((MONTHS_BETWEEN(HIREDATE, TRUNC(HIREDATE, 'YYYY')) - TRUNC(MONTHS_BETWEEN(HIREDATE, TRUNC(HIREDATE, 'YYYY')))) * 30) + 1) || '일입니다.' AS 부임일
    FROM PROFESSOR;
--3) 교수중에 3월에 부임한 교수의 명단을 검색하세요
SELECT PNO
     , PNAME
     , HIREDATE
     FROM PROFESSOR
     WHERE CEIL(MONTHS_BETWEEN(HIREDATE, TRUNC(HIREDATE, 'YYYY'))) = 3;