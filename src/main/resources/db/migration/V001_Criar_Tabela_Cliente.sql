create table cliente(
id bigint not null primary key auto_increment,
nomecliente varchar (100),
endereco varchar (50),
numero varchar (80),
bairro varchar (80),
id_municipio int not null,
telefone varchar (30),
celular varchar (30)
);