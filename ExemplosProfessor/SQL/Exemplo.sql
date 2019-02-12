DROP DATABASE IF EXISTS escola;
CREATE DATABASE IF NOT EXISTS escola;
USE escola;
CREATE TABLE salas_de_aula(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) UNIQUE NOT NULL,
	quantidade_maxima_alunos SMALLINT UNSIGNED NOT NULL
);

INSERT INTO salas_de_aula (nome, quantidade_maxima_alunos)
VALUES
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

INSERT INTO usuarios (id_sala_de_aula, nome, cpf) VALUES
(1, 'Pedro', '12345678998'),
(3, 'Gustavo', '12345678997'),
(2, 'Gabriel', '12345698798'),
(2, 'Guilherme', '32165498798'),
(1, 'Henrique', '45612378978'),
(1, 'Rafael', '12345678945');


SELECT 
	usuarios.nome 'Aluno',
	salas_de_aula.nome 'Sala'
FROM usuarios
JOIN salas_de_aula ON(usuarios.id_sala_de_aula = salas_de_aula.id);

-- Quantidade de alunos que estão na sala do play station
SELECT COUNT(usuarios.id) FROM usuarios
JOIN salas_de_aula 
	ON(salas_de_aula.id = usuarios.id_sala_de_aula)
WHERE salas_de_aula.nome = 'Sala PS';

INSERT INTO habilidades (id_campeao, nome, descricao) 
VALUES
((SELECT id FROM campeos WHERE nome = 'Viktor'),
'IRON SIGHTS', 'Look down the barrel of your rifle. Gain improved accuracy but move 50% Slower.'),

((SELECT id FROM campeos WHERE nome = 'Viktor'),
'FRAG GRENADE', 'Throw a fragmentation grenade dealing up to 750 damage. Holding Frag Grenade will cook the grenade and reduce its detonation time.'),

((SELECT id FROM campeos WHERE nome = 'Viktor'),
'HUSTLE', 'Lower your weapon and run 65% faster.'),

((SELECT id FROM campeos WHERE nome = 'Viktor'),
'BARRAGE', 'Bring up your Targeting Binoculars. Click on Enemy players to guide an artillery shell dealing 1400 damage to their location. Viktors Movement speed is slowed while channeling Barrage.');

SELECT habilidades.nome 'Habilidade', campeos.nome 'Campeão'
FROM habilidades 
JOIN campeos ON(habilidades.id_campeao = campeos.id);

/*
	PESSOAS
nome 		linguagem
Francisco	Java
Crispim 	Java
Leonardo 	Pascal
Marcio P	Pascal
Marcio A	Php
Rafael		C++
*/
SELECT linguagem, COUNT(nome) 
FROM pessoas
GROUP BY linguagem
ORDER BY COUNT(nome) DESC;
/*
Nome 	Quantidade
Java		2
Pascal		2
Php			1
C++			1*/


