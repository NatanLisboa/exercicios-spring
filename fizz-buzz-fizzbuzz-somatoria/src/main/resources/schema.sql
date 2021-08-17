DROP TABLE IF EXISTS tb_fizz;
DROP TABLE IF EXISTS tb_buzz;
DROP TABLE IF EXISTS tb_fizz_buzz;

create table tb_fizz(
	id int primary key auto_increment,
    number int
);


create table tb_buzz(
	id int primary key auto_increment,
    number int
);


create table tb_fizz_buzz(
	id int primary key auto_increment,
    number int
);