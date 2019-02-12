DROP DATABASE IF EXISTS exercicio_web;
CREATE DATABASE IF NOT EXISTS exercicio_web;
use exercicio_web; 

CREATE TABLE alunos(
            id INT AUTO_INCREMENT PRIMARY KEY,
            nome VARCHAR(100),
            codigo_matricula VARCHAR(4),
            nota1 TINYINT,
            nota2 TINYINT,
            nota3 TINYINT,
            frequencia TINYINT
);

INSERT INTO alunos (nome, codigo_matricula, nota1, nota2, nota3, frequencia) VALUES
('Alan', '1234', 7, 9, 10, 100),
('Maria Eduarda', '2345', 5, 6, 4, 70),
('Rosa Helena', '3456', 10, 10, 10, 80);
