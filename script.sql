create database findEats;

use findEats;

create table usuario(
	idUsuario int primary key auto_increment,
    nome varchar(30),
    sobrenome varchar(30),
    senha varchar(30),
    email varchar(30)
);

create table receita(
	idReceita int primary key auto_increment,
    nome varchar(30),
    modoPreparo varchar(200),
    porcao int
);

create table ingredientes(
    nomeIngr varchar(30) primary key    
);

create table recipe_ingr(
    nomeRec varchar(30),
    nomeIngr varchar(30),
    foreign key (nomeIngr) references ingredientes(nomeIngr),
    foreign key (nomeRec) references receita(nome)
);