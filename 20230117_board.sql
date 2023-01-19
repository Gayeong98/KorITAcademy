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

# User 레코드를 삽입
# 아이디는 자동값을 그대로 사용, 비밀번호는 'P!ssw0rd', 이름 '고길동', 전화번호는 '010-4488-9944'인 데이터를 생성

# -- 회원가입 할 때 사용 -- 
INSERT INTO User(password, name, telNumber) VALUES ('P!ssw0rd', '고길동', '010-4488-9944');

SELECT * FROM User; # 테이블 확인

# User 테이블에서 이름이 '고길동'인 레코드의 비밀번호를 'qwer1234!!'로 수정

# -- 각종 회원정보 수정할 때 사용 --
UPDATE User SET password = 'qwer1234!!' WHERE name = '고길동';

# User 테이블에서 id가 1인 레코드를 삭제

# 실제로는 잘 하지 않는 방법
DELETE FROM User WHERE id = 1;

INSERT INTO Board(boardTitle, boardContent, boardDate, boardWriter)
VALUES ('안녕히가세요. ', '안녕하세요. 반갑습니다. 안녕히가세요.', '2023-01-11', 3);

# 전체 게시물 보기
SELECT * FROM Board;

# 최신글 순으로 보기
SELECT * FROM Board ORDER BY boardDate DESC;
# 오래된 글 순으로 보기
SELECT * FROM Board ORDER BY boardDate ASC;

# 10일 이내에 작성된 글 보기
SELECT * FROM Board WHERE boardDate >= '2023-01-08';

# 10일 이내에 작성된 글을 최신순으로 보기
SELECT * FROM Board WHERE boardDate >= '2023-01-08' ORDER BY boardDate DESC;

# 작성자가 1 이면서 10일 이내에 작성된 글을 최신 순으로 보기
SELECT * FROM Board WHERE boardWriter = 1 AND boardDate >= '2023-01-08' ORDER BY boardDate DESC;

# 게시물 제목에 '안녕하세요'가 포함된 게시글 보기
SELECT * FROM Board WHERE boardTitle LIKE '%안녕하세요%';

# 게시물 내용에 '반갑습니다'가 포함된 게시글 보기
SELECT * FROM Board WHERE boardContent LIKE '%반갑습니다%';

# 게시물 제목 + 내용에 '안녕히가세요'가 포함된 게시글 보기
SELECT * FROM Board WHERE boardTitle LIKE '%안녕히가세요%'  OR boardContent LIKE '%안녕히가세요%';

SELECT * FROM Board;

SELECT * FROM Board WHERE boardTitle LIKE '%%';

# board 테이블에서 boareWriter가 1이거나 2인 레코드에서 모든 컬럼 선택
SELECT * FROM Board WHERE boardWriter = 1 OR boardWriter = 2;
SELECT * FROM Board WHERE boardWriter IN (1,2);

# Board 테이블에서 boardDate가 2023-01-03부터 2023-01-10까지 레코드에서 모든 컬럼을 선택
SELECT * FROM Board WHERE boardDate BETWEEN '2023-01-03' AND '2023-01-10';

# Board 테이블에서 작성일자가 1월달인 레코드에서 모든 컬럼을 선택
SELECT * FROM Board WHERE boardDate LIKE '____-01-__';
SELECT * FROM Board WHERE boardDate LIKE '%-01-%';
SELECT * FROM Board WHERE boardDate BETWEEN '2023-01-01' AND '2023-01-31';
