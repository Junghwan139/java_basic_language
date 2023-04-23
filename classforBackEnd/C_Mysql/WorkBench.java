package classforBackEnd.C_Mysql;

public class WorkBench {

    public static void main(String[] args) {

/*

1. workbench 설치
2. database -> manage connections -> connect to database

3. delete와 truncate의 차이
- delete는 storage까지 삭제하지는 않아 복구가 가능(log를 남김)
- truncate는 log(x) delete의 삭제 속도가 빠름


4. select
- select 필드이름(* 전부) from 테이블이름 where 조건
  ex) select name, email from author where id>1 AND password = 1234;

*주석 : #

 - 중복제거 : select distinct 열이름 from 테이블이름
 - 정렬 :  기본 (별도 조건 없으면 pk기준 오름차순 정렬)
               order by 컬럼명(컬럼명 기준 오름차순 정렬)
               desc(내림차순 정렬), asc(오름차순 정렬 생략가능)
ex) select * from author order by Name desc, email desc;

 - 별칭(alias) 사용 : select 열이름 as 별칭 from 테이블 (as) 별칭

5. 자료형

(정수)
 - TINYINT (byte) : 1바이트, ex) 나이
 - INT (int) : 4바이트,
 - BIGINT (long) : 8바이트, ex) ID
 - UNSIGNED : 마이너스 사용x, 모두 양수로

(실수)
 - 고정 소수점 타입 DECIMAL(M,D  / Bigdecimal) : M은 총자릿수(정수부+소수부) 65자리까지 표현,
                                             D는 소수부 의미
 - 부동 소수점 타입 (float, double) : 오차가 발생할 여지가 있음

(문자)
 - CHAR (M / char) : 고정 길이의 문자열, M은 문자의 길이(0~255까지)
 - VARCHAR (M / string) : 가변 길이의 문자열, 0부터 65,535까지, 길이를 지정하더라도
                          실제 입력된 문자열의 길이만큼만 저장하고 사용(길이는 최대길이)
 - TEXT : 일반문자열 타입, varchar보다 더 큰 범위의 표현이 가능 ex) LONGTEXT는 4GB, B-tree인덱싱 불가

 - BLOB : 다양한 크기의 바이너리 데이터 저장, 일반적으로 PNG와 같은 이미지 파일 저장할 때 지정하는 타입
          *바이너리 데이터 : 2진법을 통해 표현된 데이터
          → 최근 파일 올려 놓고 경로를 저장
 - ENUM : 미리 들어갈 수 있는 특정 데이터값을 지정,
    ex) ALTER TABLE author MODIFY COLUMN role ENUM('user','admim') not null default 'user';
    db는 유연하게하고 java를 엄격하게

(날짜 / 시간)
 - DATE : YYYY-MM-DD
 - DATETIME(m) : YYYY-MM-DD HH:MM:SS, m지정시 소수점 microseconds  "java의 localdatetime"
 - DATETIME DEFAULT CURRENT_TIMESTAMP
* 기준 시간대 utc 기준 kst(한국) -> 보통 db는 utc 그대로 두고 java에서 한국시간으로 해서 웹에 보여줌
* utc + 9 = 한국시간

(비교연산자)
 - =, !=, <>, IS NULL, IS NOT NULL(조회 조건에 사용), BETWEEN min AND MAX
 - IN(), NOT IN() : 복수의 value를 가지고 비교를 할 때
ex) where name = '홍길동' or name = '홍길동2' or name = '홍길동3';
       where name in ('홍길동','홍길동2','홍길동3');
 - and(&&), or(||), not(!)

6. 검색패턴
 - like (%)
ex) where Name like '%홍%';
 - REGEXP (정규표현식)
ex) where Name REGEXP '^홍|동$';    → 홍으로 시작하거나 동으로 끝나는

7. 타입변환
 - CAST : CAST(a as type)    CAST(20200101 AS DAT); => 2020-01-01
 - CONVERT : 문자열을 날짜 / 시간으로 바꾸는 CONVERT('2020-01-01',DATE) => 2020-01-01

8. 제약조건(constraint)
제약조건은 컬럼에 넣는게 아니고 제약조건 테이블이 따로 있어서 add
데이터를 입력받을 때 실행되는 검사 규칙
 - 종류 : NOT NULL, PRIMARY KEY(NOT NULL + UNIQUE), FOREIGN KEY(NOT NULL), UNIQUE, DEFAULT

 - UNIQUE
 - alter table author add unique(Email)
unique 제약 조건을 설정하면 자동으로 index로 설정

on upadate cascade


9. 흐름제어
 - CASE value
   WHEN [compare_value] THEN result
   WHEN [compare_value] THEN result
    ELSE result
    END

select ID, Name,
(CASE role
When 'user' THEN '사용자'
WHen 'admin' then '관리자'
else '빈값'
end) as 유저정보
from author;

 - IF() : SELECT IF(0<1, 'yes','no');
 - IFNULL(a,b) : 만약 a의 값이 NULL이 아니면 a 그 자체를 반환하고, NULL이면 b를 반환
select ID, Name, (ifnull(Email,'없음')) as 이메일 from author;







*/



    }

}
