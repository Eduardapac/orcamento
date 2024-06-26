create table lancamento(
    id bigint not null primary key auto_increment,
    datalancamento date,
    idcliente bigint not null,
    tipolancamento varchar(10),
    valorlancamento decimal(12,2)
);

alter table lancamento add constraint FK_cliente_lancamento foreign key (idcliente) references cliente(id);