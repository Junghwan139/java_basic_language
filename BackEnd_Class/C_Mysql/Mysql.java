package BackEnd_Class.C_Mysql;

public class Mysql {
    public static void main(String[] args) {

/*

1. Database(Mysql) 이란
    1. 관계형 데이터베이스(RDB) : Mysql, Oracle, Postgres
    2. NoSQL(key와 value로 이루어짐) : MongoDB, Redis*(많이 씀) -> 게임회사에서 많이 씀(1:1 관계라서?)
    3. database = schema
    4. information shcema에서 관련 모든 데이터베이스 정보를 가지고 있음. 때에 따라 여기에서 조회할 경우도 있음
    5. 엔진에 따라 서버 - db - 스키마 - 테이블인 경우가 있음

2. 설치 / 가동
    1. 설치 : docker run --name megajava_mysql -e MYSQL_ROOT_PASSWORD=1234 -d -p 3306:3306 mysql:latest
    2. *) -d : 백그라운드 실행(프론트그라운드 실행시 커맨트창을 쓸 수가 없음)
    3. 일반접속 : 1) alphine 접속 : docker exec -it f8066e8f75cd /bin/sh
    4. mysql 접속 : mysql -u root -p
    5. 한번에 접속 : docker exec -it f8066e8f75cd -u root -p
    ****
3. 데이터베이스 명령어
    1. 데이터베이스 조회 : show databases;
    2. 데이터베이스 생성 : create database DB이름;
    3. 데이터베이스 삭제 : drop database DB이름;
    4. 데이터베이스 사용 : use DB이름;
    5. 테이블 조회(DB안에서) : show tables;

4. 테이블
    1. 행(row), 튜플(tuple), 레코드(record)
    2. 열(column), 필드(field), 속성(attribute)
    3. PK(primary key / 기본키) : 중복방지(레코드간 식별할 수 있는 키)
        1. 기본키(unique, not null 기본) : PRIMARY KEY(열이름) AUTO_INCREMENT
    4. FK(foreign key / 외래키) : 두 테이블을 서로 연결하는 데 사용하는 키
        1. ex) post게시에 글쓴이는 autor데이터에 의존적(RelationDB특성) - pk에 의존 시켜야 함
        2. FK는 일반적으로 의존하는 테이블의 pk에 의존시킴
        3. 외래키 : FOREIGN KEY(열이름) REFERENCES 참조테이블(참조열) ON UPDATE CASCADE → on update(업데이트에 따름), on delete(삭제에 따름)

5. 테이블 명령어(DDL)
    1. 테이블 세부조회 : describe 테이블이름;
    2. 테이블 생성 : create table 테이블이름 (필드이름 필드타입, 필드이름 필드타입);
        1. CREATE TABLE 테이블이름 (필드이름 INT / VARCHAR(크기) PRIMARY KEY AUTO_INCREMENT NULL / NOT NULL, ...)
    3. 테이블 이름변경 : Alter table 기존테이블이름 rename 변경테이블이름
    4. 테이블 삭제 : DROP TABLE 테이블이름
        1. 테이블 데이터 삭제 : TRUNCATE TABLE 테이블 이름
        2. 테이블이 있으면 삭제 : drop table if exists 테이블이름; (스프링과 연결되어 있을때 삭제 오류로 실행안되는 것 방지)

6. 필드 명령어
    1. 테이블 열 수정(추가, 변경, 삭제) : ALTER TABLE 테이블이름 ADD 필드이름 필드타입
    2. 필드이름 변경 : MODIFY 필드이름 필드타입 CHANGE 기존필드 변경필드이름 필드타
    3. 필드삭제 : DROP 필드이름



*/




    }



}
