CREATE TABLE data_lancamento (
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    data_lancamento DATE,
    codigo_categoria BIGINT(20) NOT NULL,
    codigo_filme BIGINT(20) NOT NULL,
    FOREIGN KEY (codigo_categoria) REFERENCES categoria(codigo),
    FOREIGN KEY (codigo_filme) REFERENCES filme(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO data_lancamento (codigo, data_lancamento, codigo_categoria, codigo_filme) values (1, '23/07/01', 5, 1);
INSERT INTO data_lancamento (codigo, data_lancamento, codigo_categoria, codigo_filme) values (2, '10/11/07', 5, 2);
INSERT INTO data_lancamento (codigo, data_lancamento, codigo_categoria, codigo_filme) values (3, '02/06/05', 1, 3);
INSERT INTO data_lancamento (codigo, data_lancamento, codigo_categoria, codigo_filme) values (4, '19/03/09', 2, 4);
INSERT INTO data_lancamento (codigo, data_lancamento, codigo_categoria, codigo_filme) values (5, '15/05/14', 3, 5);