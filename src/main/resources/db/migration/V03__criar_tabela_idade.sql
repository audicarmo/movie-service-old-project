CREATE TABLE idade (
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    codigo_filme BIGINT(20) NOT NULL,
    idade VARCHAR(20) NOT NULL,
    FOREIGN KEY (codigo_filme) REFERENCES filme(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO idade (codigo, codigo_filme, idade)  values (1,1, '14 anos');
INSERT INTO idade (codigo, codigo_filme, idade)  values (2,2, '14 anos');
INSERT INTO idade (codigo, codigo_filme, idade)  values (3,3, 'Classificação Livre');
INSERT INTO idade (codigo, codigo_filme, idade)  values (4,4, '12 anos');
INSERT INTO idade (codigo, codigo_filme, idade)  values (5,5, '16 anos');
INSERT INTO idade (codigo, codigo_filme, idade)  values (6,6, '14 anos');

