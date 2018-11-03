drop table tb_board purge;

create sequence board_seq start with 1 increment by 1 nocycle nocache;

create table tb_board(
board_id number NOT NULL PRIMARY KEY,
user_id varchar2(20) NOT NULL,
user_name varchar2(20) NOT NULL,
subject varchar2(50) NOT NULL,
contents varchar2(300) NOT NULL,
hits number NOT NULL,
reg_date date DEFAULT SYSDATE NOT NULL);

select * from tab;
select * from tb_board;

INSERT INTO TB_BOARD(BOARD_ID,USER_ID,USER_NAME,SUBJECT,CONTENTS,HITS) VALUES(BOARD_SEQ.NEXTVAL, 'aaa', '에이에이에이', '에이의글제목', '에이의 글내용', 0)