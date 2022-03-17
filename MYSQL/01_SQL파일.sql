-- SQL을 사용할때는 키워드는 대문자로 나머지는 소문자로
-- SQL구문을 사용하기 이전에 먼저 데이터베이스를 선택해야함
use shopdb;

-- Java는 코드 작성 후 컴파일 - 실행하는 구조
-- 하지만 SQL은 interactive 한 언어

-- 모든 회원을 조회해야함
SELECT *
FROM memberTBL;

-- 모든 회원의 이름을 조회해야함
SELECT memberName
FROM memberTBL;

SELECT memberName AS '회원이름'
FROM memberTBL;

-- 사는 지역이 '경기'인 회원의 이름과 주소를 출력하시오
SELECT memberName AS '이름' , memberAddr AS '주소'
FROM memberTBL
WHERE memberAddr = '경기';
