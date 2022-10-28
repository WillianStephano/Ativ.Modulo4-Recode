/* ModLogico_AgenciaDeViagem: */
CREATE DATABASE agencia_FlyAway;

USE agencia_FlyAway;


CREATE TABLE Usuario (
    id_usuario INTEGER PRIMARY KEY auto_increment,
    nome_usuario VARCHAR(30),
    email_usuario VARCHAR(20),
    senha_usuario VARCHAR(20),
    id_permissao INTEGER,
    foreign key(id_permissao) references Permissoes (id_permissao)
);

CREATE TABLE Destinos (
    id_destino INTEGER PRIMARY KEY auto_increment,
    nome_destino VARCHAR(50),
    preco_destino DECIMAL
);

CREATE TABLE Compra (
    id_compra INTEGER PRIMARY KEY,
    id_usuario INTEGER,
    data_compra DATE,
    valor_compra DECIMAL (5,2),
    foreign key(id_usuario) references Usuario (id_usuario)
);

CREATE TABLE Permissoes (
    id_permissao INTEGER PRIMARY KEY,
    id_usuario INTEGER,
    tipo_permissao VARCHAR(20),
    foreign key(id_usuario) references Usuario (id_usuario)
);

CREATE TABLE itens_compra (
    id_compra INTEGER,
    id_destino INTEGER,
    qtn_itens INTEGER,
    valor_compra DECIMAL(4,2),
    foreign key(id_destino) references Destinos (id_destino)
);