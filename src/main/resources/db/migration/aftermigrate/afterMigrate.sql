



delete from loan;

alter table loan auto_increment = 1;


delete from books;

alter table books auto_increment = 1;


delete from nationality;

alter table nationality auto_increment = 1;


delete from authors;

alter table authors auto_increment = 1;


delete from user;

alter table user auto_increment = 1;

insert into user(id_user, full_name, date_birth, email, address) values
(1,'Izadora Vieira', '2018-01-14',' iza@gmail.com',  'Rua dos Andradas'),
(2,'Ricardo Mendes', '1980-09-09', 'ricardo@gmail.com', 'Rua dos Andradas'),
(3,'James Hetfield', '1970-09-09','james@gmail.com',  'Avenida Rofrigues Alves'),
(4,'Dave Mustaine',  '1969-09-09','dave@gmail.com', 'Rua Batista de Carvalho'),
(5,'John Connor', '1976-09-09','connor@gmail.com',  'Rua Araújo Leite'),
(6,'Sarah Connor', '1950-09-09', 'sarah@gmail.com', 'Avenida Getúlio Vargas'),
(7,'Simone Simons', ' 1998-09-09','simons@gmail.com', 'Avenida das Laranjeiras');



insert into authors(id_authors, author_name, date_birth, nationality)
values(1, 'Gabriel Torres', '1987-02-03', 'Brazilian'),
(2, 'Andrew Tanembaum', '1950-08-09', 'American'),
(3, 'Gilleanes T.A.Guedes', '1960-01-10', 'Spanish'),
(4, 'Paulo Alécio', '1999-03-06', 'Brazilian'),
(5, 'Peter Jackson', '1976-09-02', 'English'),
(6, 'Stan Lee', '1930-10-09', 'American')
;


insert into nationality(id_nationality, nationality_name)
values(1, 'Brazilian'),
(2, 'Spanish'),
(3, 'English'),
(4, 'American'),
(5, 'French'),
(6, 'Canadian')
;

insert into books(id_books, title, isbn, authors_name, year_publication, copy_avaliable)
values (1, 'Montagem de Micros', '12345', 'Gabriel Torres', '2022-09-04','2'),
(2, 'UML_Livro_Estudos', '2468', 'Gilleanes T.A.Guedes', '2023-09-12', '3'),
(3, 'Manual da Paciência e Conhecimento', '3579', 'Paulo Alécio', '2020-09-07', '2'),
(4, 'O senhor dos Anéis', '1370', 'Peter Jackson', '1999-10-10', '3'),
(5, ' Os Vingadores', '4812', 'Stan Lee','1980-10-07', '2')
;



insert into loan(id_loan, name_user, title_book, start_date, return_date)
values
(1, 'Ricardo Mendes', 'O Senhor dos Anéis', '2024-03-03', '2024-03-10'),
(2, 'Izadora Vieira', 'Montagem de Micros', '2024-05-05', '2024-05-12'),
(3, 'James Hetfield', 'Os Vingadores', '2023-03-10', '2024-03-17'),
(4, 'John Connor', 'Manual da Paciência e Conhecimento', '2022-07-02', '2022-07-09');
