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