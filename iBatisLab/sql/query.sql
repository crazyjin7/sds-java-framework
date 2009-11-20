
drop table dept;
drop table member;
drop sequence member_id_seq;

create table dept (
	dept_no number not null,
	dept_name varchar(10) not null,
	primary key (dept_no)
);

create table member (
	id number not null,
	name varchar(10) not null,
	dept_no number,
	addr varchar(50),
	primary key (id)
);

create sequence member_id_seq start with 6;

insert into dept (dept_no, dept_name) values (1, 'SI');
insert into dept (dept_no, dept_name) values (2, 'SM');



insert into member (id, name, dept_no, addr) values (1, 'kkang', 1, 'Seoul');
insert into member (id, name, dept_no, addr) values (2, 'kim', 1, 'Seoul');
insert into member (id, name, dept_no, addr) values (3, 'lee', 2, 'Busan');
insert into member (id, name, dept_no, addr) values (4, 'park', 1, 'Incheon');
insert into member (id, name, dept_no) values (5, 'uzoo', 2);

commit;


select * from member;


