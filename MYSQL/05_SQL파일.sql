-- Join : 두개의 테이블을 조건에 따라 결합시키는 연산
-- Inner Join, Outer Join으로 크게 두가지로 분류하고 
-- Outer Join은 다시 3개로 분류가능
-- Left Outer Join, Rigt Outer Join, Full Outer Join

-- 일반적인 경우 Join이라고 하면 Inner Join이라고 지칭함 

Use sqldb;

Select *
from stdTbl;

Select *
From clubTbl;

Select *
From stdclubTbl;

-- 학생을 기준으로 학생이름, 지역, 가입한 동아리, 동아리방정보를 출력하기 
Select S.name, S.addr, C.clubname, C.clubroom
From stdTbl S 
	Inner Join stdclubTbl SC 
    On S.name = SC.name
    Inner Join clubTbl C 
    On Sc.clubname = C.clubname;
    
-- 테이블에는 Index 설정이 가능한데 검색을 빠르게 할수가 있음 하지만 데이터를 추가나 제거할때는 
-- 더 느리게 되므로 읽기위주의 쿼리에만 해주는게 좋음 
-- Index의 종류로는 
-- Clustered Index형과 Secondary Index로 두가지가있음 
-- Clustered Index는 테이블당 한개만 존재 가능하고 PK로 설정한 컬럼에 이 인덱스가 자동으로 설정됨
-- Clustered Index는 테이블을 해당 컬럼으로 정렬시킴  
-- Secondary Index는 Unique라는 제약조건이나 Create Index로 만들어짐 
-- 원하는 컬럼에 Secondary Index를 설정할수가 있음 
-- Secondary Index는 책 뒤쪽에 있는 찾아보기 페이지와 같은 기능을 제공함 
-- Secondary Index를 너무 많이 설정하면 오히려 성능에 좋지않음 

-- Outter Join은 Join조건에 만족하지 않는 행까지 포함하는 연산임 
-- Select <컬럼목록>
-- From <첫번째 테이블>(Left Table)
--  	<Left | Right | Full> Outer Join <두번째 테이블>(Right Table)
-- 		On <조인조건>
-- Where <검색조건>
-- ~~


-- 전에 햇엇던 Sqldb의 buyTbl, userTbl을 이용하여 전체 회원의 구매내역 구하기 
Select *
From userTbl;

Select *
From buyTbl;

Select U.name, B.prodName
From userTbl U
	Left Outer Join buyTbl B
    ON U.userId = B.userId;
    
-- 한번도 구매한 이력이 없는 회원 

Select U.name, B.prodName
From userTbl U
	Left Outer Join buyTbl B
	On U.userId = B.userId
Where B.prodName Is Null;

-- Cross Join은 많이 사용되지는 않음 
-- 대신 결과 레코드 집합을 많이 생성할수 있어서 테스트 데이터를 임의로 생성할때 가끔 사용함 
-- Catesian Product

-- Table과 View에 대한 상세 
-- Index(B-tree, Balanced Tree, 균형트리) 
-- Stored Procedure 
