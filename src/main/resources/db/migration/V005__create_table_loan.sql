create table loan(
id_loan int primary key auto_increment not null,
name_user varchar(50) not null,
title_book varchar(255) not null,
start_date datetime not null,
return_date datetime not null
);
