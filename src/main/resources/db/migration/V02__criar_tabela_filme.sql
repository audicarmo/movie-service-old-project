CREATE TABLE filme(
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    ativo BOOLEAN NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO filme (nome, ativo) values ('Missão Impossível 1', true);
INSERT INTO filme (nome, ativo) values ('Missão Impossível 2', true);
INSERT INTO filme (nome, ativo) values ('Os Pinguins de Madagascar', true);
INSERT INTO filme (nome, ativo) values ('O Titanic', true);
INSERT INTO filme (nome, ativo) values ('O Grito', true);
INSERT INTO filme (nome, ativo) values ('O Julgamento', true);
