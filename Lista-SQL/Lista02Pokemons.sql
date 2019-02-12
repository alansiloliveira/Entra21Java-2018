SELECT * FROM pokemons;

SELECT ataque, especial_ataque, defesa, especial_defesa FROM pokemons;

SELECT nome, categoria, ataque FROM pokemons ORDER BY ataque ASC;

SELECT altura, peso, peso / (altura * altura) 'IMC' FROM pokemons; 

SELECT altura, peso, peso / (altura * altura) 'IMC' FROM pokemons ORDER BY IMC DESC;

SELECT nome, LENGTH(nome) AS tamanho FROM pokemons ORDER BY nome DESC;

SELECT nome, descricao, LENGTH(nome) as tamanho FROM pokemons WHERE LENGth(nome) > 10;

SELECT nome, categoria, MIN(ataque) From pokemons WHERE ataque = (SELECT MIN(ataque) FROM pokemons);

SELECT ataque, especial_ataque, nome, defesa, especial_defesa FROM pokemons ORDER BY ataque ASC;

SELECT AVG(ataque) AS Media FROM pokemons;

SELECT SUM(ataque) AS Soma From pokemons;

SELECT AVG(ataque)'Media' FROM pokemons WHERE nome LIKE 'P%';


