DROP DATABASE IF EXISTS joguinho;
CREATE DATABASE IF NOT EXISTS joguinho;
USE joguinho;
CREATE TABLE campeoes(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT nULL
);
CREATE TABLE habilidades(
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_campeao INT,
	nome VARCHAR(100) NOT NULL,
	descricao text,
	FOREIGN KEY(id_campeao) REFERENCES campeoes(id)
);
INSERT INTO campeoes (nome) values
('Viktor'),
('Meve'),
('Grover'),
('Makoa');

INSERT INTO habilidades (id_campeao, nome, descricao)
VALUES
((SELECT id FROM campeoes WHERE nome = 'Viktor'), 
'Assault Rifle', 'Fire one shot every 0.1s that deals 135 damage. Effective up to medium range.'),
((SELECT id FROM campeoes WHERE nome = 'Viktor'), 
'IRON SIGHTS', 'Look down the barrel of your rifle. Gain improved accuracy but move 50% Slower.'),
((SELECT id FROM campeoes WHERE nome = 'Viktor'),
'FRAG GRENADE', 'Throw a fragmentation grenade dealing up to 750 damage. Holding Frag Grenade will cook the grenade and reduce its detonation time.'),
((SELECT id FROM campeoes WHERE nome = 'Viktor'),
'HUSTLE', 'Lower your weapon and run 65% faster.'),
((SELECT id FROM campeoes WHERE nome = 'Viktor'),
'BARRAGE', 'Bring up your Targeting Binoculars. Click on Enemy players to guide an artillery shell dealing 1400 damage to their location. Viktor Movement speed is slowed while channeling Barrage.');
;