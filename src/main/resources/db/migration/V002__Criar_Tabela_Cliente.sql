create table cliente(
id bigint not null primary key auto_increment,
nome varchar(100),
endereco varchar(50),
numero varchar(80),
bairro varchar(80),
id_municipio int not null,
telefone varchar(30),
celular varchar(30)
);

alter table cliente add constraint FK_municipio_cliente foreign key (id_municipio) references municipio(id);