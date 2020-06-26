CREATE TABLE categoria(
    codigo BIGINT(2) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (codigo, nome) values (1, 'Comédia');
INSERT INTO categoria (codigo, nome) values (2, 'Terror');
INSERT INTO categoria (codigo, nome) values (3, 'Drama');
INSERT INTO categoria (codigo, nome) values (4, 'Romance');
INSERT INTO categoria (codigo, nome) values (5, 'Suspense');
