drop table member;
create table member(
	userid varchar2(12) primary key,
	userpass varchar2(20)
);
insert into member values('uzoo1', 'uzoo111');
insert into member values('uzoo2', 'uzoo222');
select * from member;