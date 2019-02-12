DROP DATABASE IF EXISTS exercicio01;
CREATE DATABASE IF NOT EXISTS exercicio01;

USE exercicio01;

CREATE TABLE alunos(
    id                  INT AUTo_INCREMENT PRIMARY KEY,
    nome                VARCHAR(100),
    codigo_matricula    VARCHAR(11),
    nota1               FLOAT NOT NULL,
    nota2               FLOAT NOT NULL,    
    nota3               FLOAT NOT NULL,   
    frequencia          TINYINT
);
