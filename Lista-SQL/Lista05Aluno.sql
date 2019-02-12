DROP database IF EXISTS alunos;
CREATE DATABASE IF NOT EXISTS alunos;
USE alunos;

CREATE TABLE alunos(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(200) NOT NULL,
	idade INT NOT NULL
);

CREATE TABLE caracteristicas(
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_alunos INT NOT NULL,
	nome VARCHAR(150) NOT NULL,
	FOREIGN KEY(id_alunos) REFERENCES alunos(id)
);

INSERT INTO alunos(nome, idade) VALUE 
('Alice', 18),
('Sophia', 4),
('Miguel', 9),
('Heitor', 23),
('Valentina', 15),
('Joaquim', 419);



INSERT INTO caracteristicas(id_alunos, nome) VALUES
((SELECT id FROM alunos WHERE nome = 'Heitor'), 'Egoista'),
((SELECT id FROM alunos WHERE nome = 'Alice'), 'Ordanizado(a)'),
((SELECT id FROM alunos WHERE nome = 'Sophia'), 'Pontual'),
((SELECT id FROM alunos WHERE nome = 'Miguel'), 'Criativo(a)'),
((SELECT id FROM alunos WHERE nome = 'Heitor'), 'Proativo(a)'),
((SELECT id FROM alunos WHERE nome = 'Alice'), 'Altruísta'),
((SELECT id FROM alunos WHERE nome = 'Valentina'), 'Pessimista'),
((SELECT id FROM alunos WHERE nome = 'Joaquim'), 'Flexível modelo'),
((SELECT id FROM alunos WHERE nome = 'Sophia'), 'Observadora'),
((SELECT id FROM alunos WHERE nome = 'Joaquim'), 'Paciente'),
((SELECT id FROM alunos WHERE nome = 'Heitor'), 'Indelicado(a)'),
((SELECT id FROM alunos WHERE nome = 'Sophia'), 'Desobediente'),
((SELECT id FROM alunos WHERE nome = 'Miguel'), 'Intolerante'),
((SELECT id FROM alunos WHERE nome = 'Joaquim'), 'Empático(a)'),
((SELECT id FROM alunos WHERE nome = 'Sophia'), 'Egoísta'),
((SELECT id FROM alunos WHERE nome = 'Heitor'), 'Egoísta'),
((SELECT id FROM alunos WHERE nome = 'Joaquim'), 'Altruísta'),
((SELECT id FROM alunos WHERE nome = 'Sophia'), 'Sensível');

SELECT alunos.nome 'Nome', caracteristicas.nome'Caracteristicas' 
From alunos
JOIN caracteristicas ON (caracteristicas.id_alunos = alunos.id);

SELECT COUNT(alunos.nome) FROM alunos
JOIN caracteristicas ON (caracteristicas.id_alunos = alunos.id) 
WHERE caracteristicas.nome = 'Altruista';