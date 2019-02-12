DROP database IF EXISTS escola;
CREATE DATABASE IF NOT EXISTS escola;
USE escola;

CREATE TABLE salas_de_aula(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) UNIQUE NOT NULL,
	quantidade_maxima_alunos SMALLINT UNSIGNED NOT NULL
);

INSERT INTO salas_de_aula (nome, quantidade_maxima_alunos) VALUE
('Sala Xbox', 4),
('Sala PS', 10),
('Sala Nintendinho', 2);

CREATE TABLE usuarios(
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_sala_de_aula INT NOT NULL,
	nome VARCHAR(200) UNIQUE NOT NULL,
	cpf VARCHAR(12) NOT NULL,
	FOREIGN KEY(id_sala_de_aula) REFERENCES salas_de_aula(id)
);

INSERT INTO usuarios (id_sala_de_aula, nome, cpf) values
(1, 'Pedro', '12345678998'),
(3, 'Gustavo', '12345678997'),
(2, 'Gabriel', '12345678999'),
(1, 'Henrique', '12345678988'),
(2, 'Guilherme', '52555555555'),
(1, 'Rafael', '55566666688');
