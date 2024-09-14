create table books(
id_books int primary key auto_increment not null,
title varchar(255) not null,
isbn varchar(50) not null,
authors_name varchar(45) not null,
year_publication datetime not null,
copy_avaliable int not null

);