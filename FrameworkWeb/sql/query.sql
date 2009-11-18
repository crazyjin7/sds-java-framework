drop table member;
create table member(
	userid varchar2(12) primary key,
	userpass varchar2(20)
);
insert into member values('uzoo1', 'uzoo111');
insert into member values('uzoo2', 'uzoo222');
select * from member;drop table magazine;create table magazine (	magazineId  number primary key,	title         varchar2(100) not null,	price        number not null,	created     date not null);drop sequence seq_magazine;create sequence seq_magazine;insert into magazine values(seq_magazine.nextval, '마이크로소프트', 9000, sysdate);insert into magazine values(seq_magazine.nextval, 'PC 사랑', 6000, sysdate);insert into magazine values(seq_magazine.nextval, '유행통신', 4500, sysdate);select * from magazine;drop table member;create table member (	memberId  number primary key,	name         varchar2(100),	age        number,	created     date);drop table address;create table address(	addressId number primary key,	memberId number,	address varchar2(200));drop sequence seq_address;create sequence seq_address;select * from member m, address a where m.memberId=a.memberId(+);