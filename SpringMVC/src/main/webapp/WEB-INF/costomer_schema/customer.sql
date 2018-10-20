drop table tb_customer purge;

create table tb_customer(
id varchar2(10) primary key,
password varchar2(10) not null,
name varchar2(16));

select * from tab;
select * from tb_customer;