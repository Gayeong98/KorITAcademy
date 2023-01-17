# Board 데이터베이스 생성
CREATE DATABASE PEED;
USE PEED;

# User  테이블 생성
CREATE TABLE User(
	id INT PRIMARY KEY AUTO_INCREMENT, # 아이디 / 정수형태 / 기본키 / 자동 증가
	password VARCHAR(30) NOT NULL, # 패스워드 / 길이 30의 가변문자열 / 필수값
    name VARCHAR(50) NOT NULL, # 이름 / 길이 50의 가변문자열 / 필수값
    telNumber VARCHAR(15) NOT NULL UNIQUE # 전화번호 / 길이 15의 가변문자열 / 필수값 / 중복 불가능
    )
;

# Board 테이블 생성
# 게시물 번호(boardNumber)가 존재하고 정수형태 및 자동 증가로 관리,
# 게시물 번호로 각 데이터를 구분함
# 게시물 제목(boardTitle)이 존재하고 길이 200의 가변 문자열 및 필수 값으로 관리
# 게시물 내용(boardContent)이 존재하고 길이의 제한이 없는 문자열 및 필수 값으로 관리
# 게시물 작성일(boardDate)이 존재하고 날짜 타입이고 필수 값으로 관리
# 게시물 작성자(boardWriter)가 존재하고 정수 형태 및 필수 값으로 관리

CREATE TABLE Board(
	boardNumber INT AUTO_INCREMENT PRIMARY KEY,
    boardTitle VARCHAR(200) NOT NULL,
    boardContent TEXT NOT NULL,
    boardDate DATE NOT NULL,
    boardWriter INT NOT NULL
);

### DML ###

# INSERT
# - 데이터 삽입
# INSERT INTO 테이블명(컬럼명1, 컬럼명2, ...) VALUES (값1, 값2, ...);
# INSERT INTO 테이블명 VALUES (값1, 값2, ...);
# 각 컬럼에 매칭되는 값을 순서에 맞게 작성하여야 함

INSERT INTO Reservation(name, reserveDate, roomNumber) VALUES ('김철수', '2023-01-17', 3134);


