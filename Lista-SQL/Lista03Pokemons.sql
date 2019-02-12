SELECT * FROM pokemons;


UPDATE pokemons	SET categoria = 'Seed' WHERE codigo BETWEEN 50 AND 100;
SELECT categoria, codigo FROM pokemons;

UPDATE pokemons SET ataque = 29 WHERE nome LIKE '%INJ%';
SELECT nome, ataque FROM pokemons WHERE nome LIKE '%INJ%';

UPDATE pokemons SET velocidade = 2 WHERE velocidade = 5;
SELECT nome, velocidade FROM pokemons;

UPDATE pokemons SET categoria = 'Manipulate' WHERE codigo = 100;
SELECT nome, codigo, categoria FROM pokemons;

UPDATE pokemons SET nome = 'C%' WHERE nome LIKE 'R%';
SELECT nome FROM pokemons WHERE nome LIKE 'C%';

UPDATE pokemons SET altura = 0.51, peso = 0.70 WHERE altura = 0.5;
SELECT nome, altura, peso FROM pokemons;

UPDATE pokemons SET codigo = 1, defesa = 1, ataque = 1, especial_ataque = 3, especial_defesa = 4 
WHERE especial_defesa = 3 AND especial_ataque = 4;

UPDATE pokemons SET nome = LEFT(nome, 10) WHERE LENGTH(nome) > 10; 

UPDATE pokemons SET categoria = 'water' WHERE descricao = 'flame';
SELECT nome, categoria, descricao FROM pokemons;

UPDATE pokemons SET codigo = 151 WHERE codigo = 155;

UPDATE pokemons SET nome = 'Naruto', ataque = 1 WHERE nome = 'Kabuto%';
SELECT nome FROM pokemons;

UPDATE pokemons SET nome = 'Sasuke', especial_ataque = 8002, ataque = 8001 WHERE nome = 'Mew' or nome = 'Mewtwo';
SELECT nome, ataque, especial_ataque FROM pokemons WHERE nome = 'Sasuke';

UPDATE pokemons SET descricao = 'Lorem Ipsum', nome = 'Tyranitar', categoria = 'Wood Gecko' 
WHERE codigo %2= 0;
SELECT nome, codigo, categoria FROM pokemons;
