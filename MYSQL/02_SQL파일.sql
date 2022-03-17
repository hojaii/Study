USE employees;

USE shopdb;

SELECT *
FROM employees.employees;

-- 테이블 생성
CREATE TABLE indexTBL(
	first_name	VARCHAR(16), 
    last_name	VARCHAR(16),
    hire_date	DATE
	);

-- 생성된 테이블에 데이터를 입력 
INSERT INTO indexTBL VALUES('길동', '홍', '2021-01-01');

SELECT *
FROM indexTBL;    	

-- 테이블안의 데이터를 모두 삭제
DELETE FROM indexTBL;

INSERT INTO indexTBL 
	SELECT first_name, last_name, hire_date 
	FROM employees.employees
	LIMIT 500;
    
select *
FROM indexTBL;

-- 안에 500개의 데이터가 존재하지만 index는 설정이 안되어있는상태 

-- indexTBL에서 first_name이 'Mary'인 사람만 조회
SELECT first_name, last_name, hire_date
FROM indexTBL
WHERE first_name = 'Mary';

-- 인덱스 설정을 안했기 때문에 Full Table scan이 실행되어서 속도가 느린형태로 실행됨 

-- index를 설정해서 더 빨리 명령 수행하기 
-- index는 column에 설정해야함 
CREATE INDEX index_indexTBL_firstname
ON indexTBL(first_name);

-- 인덱스 생성후 위 'Mary'찾기 실행하면 훨씬 빠르게 실행되는것 확인 가능 (너무 많이 인덱스를 생성하면 오히려 풀 테이블 스캔보다 느릴수도있음)

-- View만들기

CREATE VIEW v_memberTBL
AS 
	SELECT memberName, memberAddr
    FROM memberTBL;
    
SELECT *
From v_memberTBL;

-- ----------------------

-- trigger에 대해 알아보기
-- 먼저 deleteMemberTBL을 만들기
desc memberTBL; -- describe

CREATE TABLE deleteMemberTBL(
	memberID	CHAR(10),
    memberName	VarCHAR(45),
    memberAddr	varchar(45),
    deleteData	DATE
);
    
-- 이제 Trigger을 만들기
    
DELIMITer //
CREATE trigger trg_deleteMemberTBL  
	AFTER DELETE
	ON memberTBL
    FOR each row
BEGIN 
	-- 삭제된 행을 deleteMemberTBL에 입력해야함 
	Insert INTO deleteMemberTBL VALUE(
		OLD.memberID, OLD.memberName, OLD.memberAddr,
        CURDATE()
	);
END //

DELIMITer ;

-- 수행되는지 체크 

SELECT * FROM memberTBL; -- 4명
SELECT * FROM deletememberTBL; -- 0명

DELETE FROM memberTBL WHERE memberName = '아이유';

SELECT * FROM memberTBL;  -- 3명
SELECT * FROM deletememberTBL; -- 1명

SELECT *
FROM productTBL;

DELETE FROM productTBL;

SELECT * From shopdb.memberTBL;

-- stored procudure을 만들기 
DELIMITER $$ -- ;를 $$로 바꾸겟다 라는뜻 ^같이 한단어도 되긴하지만 혼동되지않도록 ^^나 $$ 를 씀
CREATE Procedure myProc()
BEGIN  -- Java에서의 {과 }를 의미함
	SELECT * FROM memberTBL WHERE memberName = '아이유';
    SELECT * FROM productTBL WHERE prodName = '냉장고';
END $$ -- 위에서 딜리미터 변환으로인해 ; 를 안쓰고 $$로 씀
DELIMITER ; -- 다시변환

CALL myProc();

