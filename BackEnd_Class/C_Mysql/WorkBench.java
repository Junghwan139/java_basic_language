package BackEnd_Class.C_Mysql;

public class WorkBench {

    public static void main(String[] args) {

/*

1. workbench 설치
    1. database -> manage connections -> connect to database
    2. delete와 truncate의 차이
        1. delete는 storage까지 삭제하지는 않아 복구가 가능(log를 남김)
        2. truncate는 log(x) delete의 삭제 속도가 빠름

2. select
    1. select 필드이름(* 전부) from 테이블이름 where 조건
    2. select name, email from author where id>1 AND password = 1234;
    3. 주석 : #
    4. 중복제거 : select distinct 열이름 from 테이블이름
    5. 정렬 : 기본 (별도 조건 없으면 pk기준 오름차순 정렬)
        1. order by 컬럼명(컬럼명 기준 오름차순 정렬)
        2. desc(내림차순 정렬), asc(오름차순 정렬 생략가능)
        3. ex) select * from author order by Name desc, email desc;
    6. 별칭(alias) 사용 : select 열이름 as 별칭 from 테이블 (as) 별칭

3. 자료형
    1. 정수
        1. TINYINT (byte) : 1바이트, ex) 나이
        2. INT (int) : 4바이트
        3. BIGINT (long) : 8바이트, ex) ID
        4. UNSIGNED : 마이너스 사용x, 모두 양수로
    2. 실수
        1. 고정 소수점 타입 DECIMAL(M,D / Bigdecimal) : M은 총자릿수(정수부+소수부) 65자리까지 표현, D는 소수부 의미
        2. 부동 소수점 타입 (float, double) : 오차가 발생할 여지가 있음
    3. 문자
        1. CHAR (M / char) : 고정 길이의 문자열, M은 문자의 길이(0~255까지)
        2. VARCHAR (M / string) : 가변 길이의 문자열, 0부터 65,535까지, 길이를 지정하더라도 실제 입력된 문자열의 길이만큼만 저장하고 사용(길이는 최대길이)
        3. TEXT : 일반문자열 타입, varchar보다 더 큰 범위의 표현이 가능 ex) LONGTEXT는 4GB, B-tree 인덱싱 불가
    4. BLOB : 다양한 크기의 바이너리 데이터 저장, 일반적으로 PNG와 같은 이미지 파일 저장할 때 지정하는 타입 (바이너리 데이터 : 2진법을 통해 표현된 데이터) → 최근 파일 올려 놓고 경로를 저장
    5. ENUM : 미리 들어갈 수 있는 특정 데이터값을 지정,
        1. ex) ALTER TABLE author MODIFY COLUMN role ENUM('user','admim') not null default 'user';
        2. db는 유연하게하고 java를 엄격하게
    6. 날짜 / 시간
        1. DATE : YYYY-MM-DD
        2. DATETIME(m) : YYYY-MM-DD HH:MM:SS, m지정시 소수점 microseconds "java의 localdatetime"
        3. DATETIME DEFAULT CURRENT_TIMESTAMP
        4. 기준 시간대 utc 기준 kst(한국) -> 보통 db는 utc 그대로 두고 java에서 한국시간으로 해서 웹에 보여줌
        5. utc + 9 = 한국시간
    7. 비교연산자
        1. =, !=, <>, IS NULL, IS NOT NULL(조회 조건에 사용), BETWEEN min AND MAX
        2. IN(), NOT IN() : 복수의 value를 가지고 비교를 할 때
        3. ex) where name = '홍길동' or name = '홍길동2' or name = '홍길동3'; where name in ('홍길동','홍길동2','홍길동3');
        4. and(&&), or(||), not(!)

4. 검색패턴
    1. like (%)
        1. ex) where Name like '%홍%';
    2. REGEXP (정규표현식)
        1. where Name REGEXP '^홍|동$'; → 홍으로 시작하거나 동으로 끝나는

5. 타입변환
    1. CAST : CAST(a as type) CAST(20200101 AS DAT); => 2020-01-01
    2. CONVERT : 문자열을 날짜 / 시간으로 바꾸는 CONVERT('2020-01-01',DATE) => 2020-01-01

6. 제약조건(constraint)
    1. 제약조건은 컬럼에 넣는게 아니고 제약조건 테이블이 따로 있어서 add
    2. 데이터를 입력받을 때 실행되는 검사 규칙
    3. 종류 : NOT NULL, PRIMARY KEY(NOT NULL + UNIQUE), FOREIGN KEY(NOT NULL), UNIQUE, DEFAULT
    4. UNIQUE
        1. alter table author add unique(Email)
        2. unique 제약 조건을 설정하면 자동으로 index로 설정
    5. FOREIGN KEY(FK)
        1. on delete - cascade(연동) / set null (null로 변경) / restrict(제한)
        2. on update - cascade / set null / restrict

7. 흐름제어
    1. CASE value
    WHEN [compare_value] THEN result
    WHEN [compare_value] THEN result
    ELSE result
    END
    select ID, Name,
    2. CASE role
    When 'user' THEN '사용자'
    WHen 'admin' then '관리자'
    else '빈값'
    end) as 유저정보
    from author;
    3. IF() : SELECT IF(0<1, 'yes','no');
    4. IFNULL(a,b) : 만약 a의 값이 NULL이 아니면 a 그 자체를 반환하고, NULL이면 b를 반환
    select ID, Name, (ifnull(Email,'없음')) as 이메일 from author;

8. JOIN
    1. inner join, outer join (left*, right)
        1. **select * from tableA inner join tableb on tableA.id = tableB.a_id**
    2. on조건은 join아니면 쓸일이 없음

9. UNION
    1. 여러 개의 select 문의 결과를 하나의 테이블이나 결과 집합으로 표현(필드 개수와 타입이 모두 같아야 한다)
    2. union all -> 모두, union -> 중복제거

10. SubQuery(서브쿼리) : 다른 쿼리 내부에 포함되어 있는 쿼리
    1. select distinct a.* from author a inner join post p on [a.id](http://a.id) = p.author_id;
    2. select * from author where id in (select author_id from post);  **(inner조인과 결과 값 같음)**
    3. not in  / not exists (null값 처리 차이 있음)
    4. join이 성능이 더 좋아서 권장하나 쿼리가 매우 복잡할 경우 join으로 대체 못 하는 경우 서브쿼리 사용할 수 밖에 없음

11. GROUP BY
    1. 검색된 결과를 특정 컬럼을 기준으로 그룹화
    2. GROUP BY 컬럼이름
    3. HAVING 조건식; -> 그룹화된 데이터에 대해 조건을 걸고 싶을 때 사용
        1. ex) select count(*) as cnt, author_id from post group by author_id having cnt >= 2;
    4. 내부적으로는 파이썬의 딕셔너리에 해당하는 것으로, 컬럼의 값이 같은 데이터를 하나로 묶어서 처리하고, 그룹화한 데이터에 대해 특정 작업을 수행할 수 있다.
    5. COUNT, SUM, AVG, MIN, MAX 함수를 사용해서 그룹화된 데이터를 집계할 수 있다.
    6. Having (where 은 전체 / having은 group by에 의해 반환되는 결과에 대한 조건, 자주 사용하는 것 count(집계함수))

12. INDEX
    1. 트리구조로 된 인덱스 (기본 탑재)
    2. root / branch를 가지고 일반적으로 인덱스가 있을때 조회성능은 좋아지나
    3. 데이터 입력, 업데이트 할 경우 속도가 더 느려짐 (추가 될 경우 데이터가 밀리는 등..)
    4. show index  from 테이블이름;
    5. index생성  : PK, FK, UNIQUE (빈번하게 조회할 것으로 예상됨), 유니크 일경우 가지수가 많음(열별로 다 다르니..)

*/



    }

}
