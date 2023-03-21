-- create student table
create table STUDENT (
  ID integer auto_increment primary key,
  NAME varchar(100) not null,
  SCORE double not null
);
-- insert data
insert into STUDENT(NAME, SCORE) values ('Bob', 50);
insert into STUDENT(NAME, SCORE) values ('John', 65.5);
insert into STUDENT(NAME, SCORE) values ('Harry', 45);
insert into STUDENT(NAME, SCORE) values ('Dick', 85);
insert into STUDENT(NAME, SCORE) values ('Dev', 25);
insert into STUDENT(NAME, SCORE) values ('Sid', 98);
insert into STUDENT(NAME, SCORE) values ('Tom', 90);
insert into STUDENT(NAME, SCORE) values ('Julia', 70.5);
insert into STUDENT(NAME, SCORE) values ('Erica', 81);
insert into STUDENT(NAME, SCORE) values ('Jerry', 85);
-- fetch the three toppers
select ID, NAME from STUDENT order by SCORE desc, ID asc limit 3;