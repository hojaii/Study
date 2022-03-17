-- 데이터베이스 사용
USE employees;

-- 일반적으로 대소문자를 섞어서 사용하는데 키워드는 대문자, 식별자는 소문자로 사용함
-- workbench는 select된 행, row(record)의 수를 제한할 수 있음

SELECT *
FROM titles;

-- SELECT에서 '*'는 모든 column을 의미함
-- FROM 뒤에는 테이블을 명시되어야함

SELECT *
FROM employees.titles;

-- 특정 컬럼의 값을 알아올때는 컬럼명을 , 를 기준으로
SELECT first_name, last_name, hire_date
FROM employees.employees;

-- 현재 사용가능한 데이터베이스를 조회.
SHOW DATABASES;

-- employees 데이터베이스를 선택
USE employees;

-- 현재 schema(데이터베이스)의 모든 테이블들에 대한 세부정보를 출력
SHOW TABLE STATUS;

-- 특정 테이블의 상세를 알고싶은경우
DESC titles;

-- alias(별칭)를 부여할 수 있어요!
-- 쿼리가 실행되면 결과집합(result set, result grid)가 생성됨
SELECT memberName AS '이름'
FROM shopdb.membertbl;
-- AS keyword는 생략이 가능함

-- 만약 sqldb라는 스키마가 존재하면 삭제
DROP DATABASE IF EXISTS sqldb;

-- sqldb 스키마를 생성
CREATE DATABASE sqldb;

-- sqldb를 사용
USE sqldb;

-- 사용자 테이블을 생성
CREATE TABLE userTBL (
    userID    CHAR(8) NOT NULL PRIMARY KEY,  -- 사용자 ID(PK)
    name      VARCHAR(10) NOT NULL,  -- 사용자 이름
    birthYear INT NOT NULL,  -- 출생연도(ex. 1991)
    addr      CHAR(2) NOT NULL, -- 주소
    mobile1   CHAR(3), -- 휴대폰 국번
    mobile2   CHAR(8), -- 휴대폰 나머지 번호
    height    SMALLINT, -- 키
    mdate     DATE  -- 회원가입일
);

-- 구매 테이블을 생성
CREATE TABLE buyTBL (
    num    INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    userID CHAR(8) NOT NULL,
    prodName CHAR(6) NOT NULL,
    groupName CHAr(4),
    price     INT NOT NULL,
    amount    SMALLINT NOT NULL,
    FOREIGN KEY(userID) REFERENCES userTBL(userID)
);


INSERT INTO usertbl VALUES('LSG', '이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8');
INSERT INTO usertbl VALUES('KBS', '김범수', 1979, '경남', '011', '2222222', 173, '2012-4-4');
INSERT INTO usertbl VALUES('KKH', '김경호', 1971, '전남', '019', '3333333', 177, '2007-7-7');
INSERT INTO usertbl VALUES('JYP', '조용필', 1950, '경기', '011', '4444444', 166, '2009-4-4');
INSERT INTO usertbl VALUES('SSK', '성시경', 1979, '서울', NULL, NULL, 186, '2013-12-12');
INSERT INTO usertbl VALUES('LJB', '임재범', 1963, '서울', '016', '6666666', 182, '2009-9-9');
INSERT INTO usertbl VALUES('YJS', '윤종신', 1969, '경남', NULL, NULL, 170, '2005-5-5');
INSERT INTO usertbl VALUES('EJW', '은지원', 1972, '경북', '011', '8888888', 174, '2014-3-3');
INSERT INTO usertbl VALUES('JKW', '조관우', 1965, '경기', '018', '9999999', 172, '2010-10-10');
INSERT INTO usertbl VALUES('BBK', '바비킴', 1973, '서울', '010', '0000000', 176, '2013-5-5');

INSERT INTO buytbl VALUES(NULL, 'KBS', '운동화', NULL , 30, 2);
INSERT INTO buytbl VALUES(NULL, 'KBS', '노트북', '전자', 1000, 1);
INSERT INTO buytbl VALUES(NULL, 'JYP', '모니터', '전자', 200, 1);
INSERT INTO buytbl VALUES(NULL, 'BBK', '모니터', '전자', 200, 5);
INSERT INTO buytbl VALUES(NULL, 'KBS', '청바지', '의류', 50, 3);
INSERT INTO buytbl VALUES(NULL, 'BBK', '메모리', '전자', 80, 10);
INSERT INTO buytbl VALUES(NULL, 'SSK', '책', '서적', 15, 5);
INSERT INTO buytbl VALUES(NULL, 'EJW', '책', '서적', 15, 2);
INSERT INTO buytbl VALUES(NULL, 'EJW', '청바지', '의류', 50, 1);
INSERT INTO buytbl VALUES(NULL, 'BBK', '운동화', NULL , 30, 2);
INSERT INTO buytbl VALUES(NULL, 'EJW', '책', '서적', 15, 1);
INSERT INTO buytbl VALUES(NULL, 'BBK', '운동화', NULL, 30, 2);

SELECT * 
FROM userTBL;

SELECT * 
FROM buyTBL;

-- userID를 Primary Key로 설정했기 때문에 입력한 순서와 결과가 다르게나옴
-- Primary Key로 설정하면 자동으로 클러스터형 인덱스가 설정
-- 클러스터형 인덱스가 설정되어서 userID 컬럼을 기준으로 오름차순 정렬

-- Where절이란?

-- name이 '김경호'인 사람의 정보를 조회하기
SELECT *
FROM userTBL
WHERE name = '김경호';

-- 1970년 이후에 출생하고 신장이 182인 이상인 사람의 아이디와 이름 조회하기
SELECT userID AS '아이디', name AS '이름'
FROM userTBL
WHERE birthYear >= 1970 AND height >= 182;

-- 키가 180 ~ 183인 사람을 조회하기
SELECT *
FROM userTBL
WHERE height >= 180 AND height <= 183;

SELECT * 
FROM userTBL
WHERE height BETWEEN 180 AND 183;

-- 지역이 '경남', '전남', '경북' 인 사람을 조회하기
SELECT *
FROM userTBL
WHERE addr='경남' OR addr='전남' OR addr='경북';

SELECT *
FROM userTBL
WHERE addr IN ('경남','전남','경북');

-- 와일드 카드를 사용해서 패턴매칭 (문자열검색하기)사용( %, _ )
-- % : 0개 이상의 글자를 의미함
-- _ : 1개의 글자
-- 홍길%, 신%당, 신_당
-- 성이 김씨인 사람들의 이름 => '김%'
SELECT name, birthYear
FROM userTBL
WHERE name LIKE '김%';   -- '='이 아니라 LIKE사용

-- SubQuery란?

-- 김경호보다 키가 크거나 같은 사람의 이름과 키를 출력하기
-- 먼저 김경호의 키를 확인
SELECT height
FROM userTBL
WHERE name = '김경호';   -- 177

-- 김경호의 키가 177 이니까 이거보다 큰 사람의 이름과 키를 출력
SELECT name, height
FROM userTBL
WHERE height >= 177;   -- 4명

-- SubQuery를 이용해서 표현
SELECT name, height
FROM userTBL
WHERE height >= (
    SELECT height
    FROM userTBL
    WHERE name = '김경호');   -- 4개
    
-- 지역이 '경남'인 사람의 키보다 키가 같거나 큰 사람을 확인하기
SELECT *
FROM userTBL
WHERE height >= ALL(
    SELECT height
    FROM userTBL
    WHERE addr = '경남');

-- 정렬이란?
-- ASC(오름차순정렬 - default), DESC(내림차순정렬)
-- ORDER BY절은 무조건 SQL 문자의 맨 마지막에 나와요!
-- 2차정렬은 동률이 발생했을때 먼저 가입한 순서대로 정렬해서 회원의 이름과 가입일을 출력
SELECT name, mdate
FROM userTBL
ORDER BY mdate ASC, name DESC;

-- userTBL에서 회원들의 거주지역 출력
SELECT DISTINCT addr
FROM userTBL;
-- 어머 중복된 행이 존재하는데 이런 필요없는 중복된 행을 제거하려면 DISTINCT 사용

-- employees Database에 있는 employees table 사용
-- 입사일을 기준으로 가장 오래전에 입사한 사람 5명의 이름을 내림차순 정렬
SELECT first_name, hire_date
FROM employees.employees
ORDER BY hire_date, first_name DESC
LIMIT 1,5;

-- 테이블 복사하는 방법
USE sqlDB;

CREATE TABLE buyTBL2 (
    SELECT * FROM buyTBL
);

SELECT * 
FROM buyTBL2;
DESC buyTBL2; -- KEY는 복사되지않았음

-- userTBL에서 나이순으로 5명만 이름과 나이를 출력
SELECT name, 2021-birthYear+1 AS '나이'
FROM userTBL
ORDER BY birthYear ASC
LIMIT 5;

-- Grouping 과 집계함수
-- buyTBL에서 사용자가 구매한 물품의 개수를 출력하기
SELECT userID, SUM(amount)
FROM buyTBL
GROUP BY userID;

-- 각 사용자별 구매액의 총합?
SELECT userID, SUM(amount*price) 
FROM buyTBL
GROUP BY userID
ORDER BY userID;

-- 많이 사용하는 집계함수
-- SUM(), AVG(), MAX(), MIN(), COUNT(), STDEV(), COUNT(DISTINCT)

-- Subquery를 사용해서 가장 큰 키와 가장 작은 키의 회원 이름과 키를 출력하기
SELECT name, height
FROM userTBL
WHERE height = (SELECT MAX(height) FROM userTBL) OR
      height = (SELECT MIN(height) FROM userTBL);