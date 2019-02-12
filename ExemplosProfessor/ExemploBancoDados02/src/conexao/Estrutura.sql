DROP DATABASE IF EXISTS exemplo_banco_dados_02;

CREATE DATABASE IF NOT EXISTS exemplo_banco_dados_02;

USE exemplo_banco_dados_02;

CREATE TABLE herois(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    raca VARCHAR(100) NOT NULL,
    descricao TEXT,
    salario DOUBLE NOT NULL,
    sexo CHAR NOT NULL,
    quantidade_filmes TINYINT NOT NULL 
    
);

