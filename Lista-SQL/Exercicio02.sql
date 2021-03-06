DROP DATABASE IF EXISTS exercicio02;
CREATE DATABASE exercicio02;
USE exercicio02;
CREATE TABLE enderecos(
	estad CHAR(2),
	cidade VARCHAR(140),
	bairro VARCHAR(120),
	cep char(10),
	logradouro VARCHAR(250),
	numero SMALLINT,
	complemento TEXT
);

INSERT INTO enderecos VALUE ('AC', 'Rio Branco', 'Ayrton Senna', '69.911-866', 'Estrada Deputado José Rui da Silveira Lino', '282', 'Casa');
INSERT INTO enderecos VALUE ('SC', 'Biguaçu', 'Fundos', '88.161-400', '','995','');
INSERT INTO enderecos VALUE ('MG', 'Santa Luiza', 'Padre Miguel', '33.082-050', 'Rua Buenos Aires', '371', 'Apartamento');
INSERT INTO enderecos VALUE ('BA', '', 'São Tomé de Paripe', '40.800.361', 'Travessa Luís Hage', '685', '');
INSERT INTO enderecos VALUE ('MG', 'Ipatinga', 'Vila Celeste', '', 'Rua Antônio Boaventura Batista', '645', '');
INSERT INTO enderecos VALUE ('rs', 'Passo Fundo', 'Nenê Graeff', '99.030-250', '', '154','');
INSERT INTO enderecos VALUE ('AM', 'Manaus', 'Petrópolis', '69.079-300', 'Rua Coronel Ferreira Sobrinho', '264', 'Fundos');
INSERT INTO enderecos VALUE ('TO', 'Gurupi', 'Muniz Santana', '77.402-130', 'Rua Adelmo ires Negri', '794', '');
INSERT INTO enderecos VALUE ('AC', '', 'Preventório', '', 'Beco da ligação II', '212', 'Bloco B');
INSERT INTO eNderecos VALUE ('AP', 'Santana', 'Comercial', '68.925-027', 'Rua Calçoene', '648', '');
INSERT INTO enderecos VALUE ('PB' , 'Cabedelo', 'Camalaú', '58.103-052', 'Rua Siqueira Campos', '249', '');	
