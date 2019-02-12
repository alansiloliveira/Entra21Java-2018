DROP DATABASE IF EXISTS exercicio03;
CREATE DATABASE exercicio03;
USE exercicio03;
CREATE TABLE champions(
	nome VARCHAR(15),
	descricao VARCHAR(250),
	habilidade1 VARCHAR(120),
	habilidade2 VARCHAR(120),
	habilidade3 VARCHAR(120),
	habilidade4 VARCHAR(120),
	habilidade5 VARCHAR(120)
);

INSERT INTO champions VALUE ('Katarina', 'a Lâmina Sinistra', 'Voracidade', 'Lâmina Saltitante', 'Preparação', 'Shunpo', 'Lótus da Morte');
INSERT INTO champions VALUE ('Yasuo', '', 'Estilo do errante', 'Tempestade de aço', 'Parede de vento', 'Espada ágil', 'Ultimo suspiro');
INSERT INTO champions VALUE ('Master Yi', 'o Espadachim wuju', 'Ataque duplo', '', '', '', '');
INSERT INTO champions VALUE ('Vayne', 'a Caçadora Noturna', 'Caçadora notura', 'Rolamento', 'Dargos de prata', 'Condear', 'Hora final');
INSERT INTO champions VALUE ('Lee sin', 'O monge Cego', 'Agitação', 'Onda Sônica /Ataque Ressonante', 'Proteger / Vontade de Ferro', 'Tempestade / Mutilar' , '');
INSERT INTO champions VALUE ('Vi', 'a Defensora de Piltover', 'Blindagem', '', 'Pancada Certeura', 'Força excessiva', 'Saque e enterrada');
INSERT INTO champions VALUE ('Diana', 'o Escárnio da Lua', 'Espada de prata lunar', 'Golpe Crescete', 'Cascata Lívida', 'Colapso Minguante', 'Zênite Lunar');
INSERT INTO champions VALUE ('Annie', 'a Criança Sombria', 'Piromania', 'Desintegrar', 'Incinerar', 'Escudo', 'Invocar');
INSERT INTO champions VALUE ('Aatrox', '', 'Poço de Sangue', 'Voo Sombrio', 'Sede de sangue / preço em sangue', 'Lâminas da Aflição', 'Massacre');


