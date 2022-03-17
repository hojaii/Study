-- 모든 회원수를 알아보기

Use sqldb;
Select count(*)
From userTbl;

-- 핸드폰을 가지고 있는 회원수를 알아보기

Select Count(mobile1)
From userTbl;

-- 사용자별 총 구매금액이 1000원이상인 사용자만 출력하기 

Select userID, Sum(price*amount)
From buyTbl
Group by userID
Having Sum(price*amount) >= 1000;

-- Where절에는 집계함수가 올 수가없음 따라서 그룹별 조건을 쓰는 Having절을 사용해야함 

-- Insert에 대해서 알아보기 

Use sqldb;

Create Table testTbl1 (
	id	Int,
    userName	Char(3),
    age	Int
);

Select *
From testTbl1;

-- 일반적인 Insert

Insert Into testTbl1 Values(1, '아이유', 20); 

-- 필요한 값만 Insert 

Insert Into testTbl1(id, userName) Values(2, '홍길동');

Insert Into testTbl1(age, id, userName) Values(40,3,'조용필');

-- 테이블안의 데이터를 모두 지우기

Delete
From testTbl1;

Create Table testTbl2(
	id	Int Auto_increment Primary Key,
    userName	Char(3),
	age Int
);

Select *
From testTbl2;

Insert Into testTbl2 Values(Null, '홍길동', 20);
Insert Into testTbl2 Values(Null, '아이유', 40);

-- auto_increment는 1부터 1씩 증가해서 값이 채워짐 
-- 이런 기본설정 값들은 모두 변수에 저장되어 있음 해당 변수를 수정하면 설정을 수정할수있음 

-- Auto_increment를 100부터 시작하게 변경하기
Alter Table testTbl2 Auto_increment = 100;

Insert Into testTbl2 Values(Null, '강감찬', 10);
Insert Into testTbl2 Values(Null, '조용필', 60);

-- 1씩증가하는게 아니라 5씩 증가시키려면 MySQL 변수에 저장되어있는걸 수정하면됨 
Set @@auto_increment_increment = 1;

Insert Into testTbl2 Values(Null, '성시경', 30);

-- 수정(Update)에 대하여 
Update testTbl2
	Set  userName = '김연아'
    Where id = 1;

-- 삭제(Delete)에 대하여

-- 테이블 안의 모든 데이터 삭제  
Delete 
From testTbl2; 

-- 조건에 맞는 데이터만 삭제 
Delete
From testTbl2 
Where id =2;

-- 삭제를 할 때는 크게 3가지
-- 1. Delete (삭제속도가 느림 Transaction Log를 기록하기 때문에) 
-- 2. Drop (테이블안의 데이터를 모두 지우려고 사용)
-- 3. Truncate (삭제속도가 빠름 Transaction Log를 기록하지 않기 때문에)

-- 명시적 형변환의 예 

Use sqldb;

-- 평균 구매 횟수 
Select Cast(Avg(amount) AS Signed Int) As '평균 구매 횟수'
From buyTbl;

Select Concat(Cast(price As Char(10)), ' 개 입니다')
From buyTbl;

-- 형변환에 대한 예제 
Select '100' + '200' ; -- +는 원래 숫자를 더하는 개념임 

Select 100 + '200' ;

Select 'Hello' + 'World'; -- 문자로 시작하는 경우 0을 반환함

Select 100 + '35Hello'; -- 문자가 숫자로 시작하는경우 숫자를 남김 (100+35)

Select Concat('Hello', 'World');

Select Concat(100,200);

Select 1> '2haha'; -- False는 숫자 0으로 표현함

Select 3> '2haha'; -- True는 숫자 1으로 표현함 

Select 0 = 'Hello';

-- 내장함수 ex)Concat() 

-- 제어에 관련된 내장함수 
Select If( 100 > 200, '참', '거짓');

Select Ifnull(100, '홍홍홍'); -- null값이 아니라면 앞에 인자 null이라면 뒤에 인자

-- 문자열 내장함수 
Select Length('abcde');
Select Length('홍길동'); -- 한글은 3바이트 

Select Char_Length('abcde');
Select Char_Length('홍길동');

Select Concat('홍', '길동'); -- 문자열 연결
Select Concat_ws('-', '1990', '02', '25');  -- 맨앞 인자로 각 인자를 결합 

Select Trim('   하하하  호호 캬캬캬     '); -- 첫 공백과 끝 공백을 제거함 
Select SubString('이것은 소리없는 아우성',3 ,5); -- 3번째 글자부터 시작, 5개의 글자 출력 (공백도 글자로 인식)
-- 이런 내장함수들이 상당히 많이있음 

-- Longtext, Longblob data type
-- 많은 글자들과 동영상을 테이블에 저장하기 위해서? 

-- 1. 영화대본 (txt파일), 영화동영상 (mp4파일)을 준비 

Use sqldb;


Create Table movieTbl (
	movie_id	Int Auto_increment Primary Key,
    movie_title	Varchar(30) Not Null,
    movie_director	Varchar(30) Not Null,
    movie_script	Longtext,
    movie_film	Longblob
) Default Charset = utf8mb4;

Insert Into movieTbl Values (Null, '쉰들러 리스트', '스티븐 스필버그', 
	Load_File('C:/SQL/movies/movie.txt'),
    Load_File('C:/SQL/movies/movie.mp4')
);

Select *
From movieTbl;

-- 최대 패킷의 크기 문제거나 보안상의 문제로 파일이 입력되지않앗음 
-- 최대 패킷의 크기는 저장할 수 있는 파일의 크기 디폴트 4MB로 설정되어있음 
-- 아무폴더에서나 보안상 문제로 인해서 데이터를 로드해올수가 없음 
-- my.ini 파일을 수정하고 서버를 재시작해야함 

Select movie_script
From movieTbl
Where movie_id = 2
Into Outfile 'C:/SQL/movies/text_out.txt'
Lines Terminated by '\\n';

Select movie_film
From movieTbl
Where movie_id = 2
Into Dumpfile 'C:/SQL/movies/video_out.mp4'

-- Data Type, 형변환, 내장함수, 특이한 데이터타입 타입입력 

-- SQL의 가장 중요한 성장, 기능, .. Join 
-- 지금까지는 하나의 테이블을 대상으로 얘기하고있엇음 

-- Join은 여러개의 테이블을 결합시켜서 원하는 데이터를 추출하는 방법을 제공함 
-- 기본적으로 RDBMS는 중복을 허용하지않음
-- 관련있는 데이터들이 여러 테이블에 나누어져 저장되어있음 
-- 그래서 Join이 필요한데 문제는 Join이라는 작업이 무거움 

-- 대부분의 경우 우리가 사용하는 Join은 Inner Join 그래서 그냥 Join이라고 말하는것은 Inner Join을 지칭함 
-- Select <컬럼의 목록>
-- From <첫번째 테이블이름>
-- 		Inner Join <두번째 테이블이름>
-- 		On <Join 조건>
-- Where
-- ~~~~

Use sqldb;

Select *
From userTbl;

Select *
From buyTbl;

-- 구매테이블에서 'EJW'가 청바지를 구매했을때 이사람의 주소를 알아야함 
Select userTbl.addr
From buyTbl
	Inner Join userTbl
    On buyTbl.userID = userTbl.userID
Where buyTbl.userID = 'EJW' AND
	buyTbl.prodname = '청바지';

-- 아래처럼도 사용할수는 있음
-- 일방적으로 헌업에서 이 방법을 많이 이용함     
Select *
From buyTbl,userTbl
Where buyTbl.userID = userTbl.userID AND
	buyTbl.userID = 'EJW';

-- Join을 할때 Table 이름에 alias를 설정하는 경우가 많음     
    Select userTbl.addr
From buyTbl B
	Inner Join userTbl U 
    On B.userID = U.userID
Where B.userID = 'EJW' AND
	B.prodname = '청바지';

Create Table stdTbl (
	name Char(6) Not Null Primary Key,
    addr Char(6) Not null
);

Insert Into stdTbl Values ('김범수', '경남');
Insert Into stdTbl Values ('성시경', '서울');
Insert Into stdTbl Values ('조용필', '경기');
Insert Into stdTbl Values ('은지원', '경북');
Insert Into stdTbl Values ('바비킴', '서울');

Select *
From stdTbl;


Create Table clubTbl (
	clubname	Char(6) Primary Key,
    clubroom	Char(6) Not null
);

Insert Into clubTbl Values ('수영', '101호');
Insert Into clubTbl Values ('바둑', '102호');
Insert Into clubTbl Values ('축구', '103호');
Insert Into clubTbl Values ('봉사', '104호');

Select *
From clubTbl
Order by clubroom ASC;

Create Table stdclubTbl (
	num Int Auto_increment Not Null Primary Key,
    name Char(6) Not Null,
    clubname Char(6) Not Null,
    foreign key(name) References stdTbl(name),
    foreign key(clubname) References clubTbl(clubname)
);

INSERT INTO stdclubtbl VALUES (NULL, '김범수', '바둑');
INSERT INTO stdclubtbl VALUES (NULL, '김범수', '축구');
INSERT INTO stdclubtbl VALUES (NULL, '조용필', '축구');
INSERT INTO stdclubtbl VALUES (NULL, '은지원', '축구');
INSERT INTO stdclubtbl VALUES (NULL, '은지원', '봉사');
INSERT INTO stdclubtbl VALUES (NULL, '바비킴', '봉사');