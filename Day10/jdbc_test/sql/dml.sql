SELECT * FROM test;

SELECT now() FROM test;
CREATE TABLE demo2(
	joindate date DEFAULT now()
);

SELECT * FROM demo2;
INSERT INTO demo2 VALUES (now());

---------------------------------------

INSERT INTO MEMBER_TBL VALUES ('java', '1234', '홍길동', '서울 서초구 서초동', now());

SELECT * FROM member_tbl;

UPDATE member_tbl SET
pw='1111',
address='서울 강남구 역삼동'
WHERE id='java';

DELETE FROM member_tbl
WHERE id='java';

-- 페이징
-- limit 시작 행(row) 번호(0~), 페이지당 게시글 갯수(인원수);
SELECT * FROM MEMBER_TBL MEMBER_TBL limit 3, 5;
