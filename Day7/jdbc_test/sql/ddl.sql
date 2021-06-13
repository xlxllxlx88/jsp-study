CREATE TABLE member_tbl(
	id varchar(20) PRIMARY KEY,
	pw varchar(20) NOT NULL,
	name varchar(50) NOT NULL,
	address varchar(500),
	joindate date DEFAULT now()
);

CREATE TABLE demo2(
	joidate date DEFAULT now()
);

INSERT INTO demo2 values (now());

SELECT * FROM demo2;

DROP TABLE IF EXISTS member_tbl;

--------------------------------------------------------------

SELECT * FROM member_tbl;

INSERT INTO
	member_tbl
VALUES (
	 'java', '0000', '김철수', '서울 강서구 화곡동', now()
);

UPDATE member_tbl
   SET pw = '1111'
	 , address = '서울 강남구 역삼동'
WHERE id='java';

DELETE FROM MEMBER_TBl WHERE id='java';

-- 페이징
-- limit 시작 행(row) 번호(0~), 페이지당 게시글 갯수(인원수); 
SELECT * FROM member_tbl limit 3,5;
