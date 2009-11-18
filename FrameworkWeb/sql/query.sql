drop table member;
create table member(
	userid varchar2(12) primary key,
	userpass varchar2(20)
);
insert into member values('uzoo1', 'uzoo111');
insert into member values('uzoo2', 'uzoo222');
select * from member;drop table magazine;create table magazine (	magazineId  number primary key,	title         varchar2(100) not null,	price        number not null,	created     date not null);drop sequence seq_magazine;create sequence seq_magazine;insert into magazine values(seq_magazine.nextval, '마이크로소프트', 9000, sysdate);insert into magazine values(seq_magazine.nextval, 'PC 사랑', 6000, sysdate);insert into magazine values(seq_magazine.nextval, '유행통신', 4500, sysdate);select * from magazine;