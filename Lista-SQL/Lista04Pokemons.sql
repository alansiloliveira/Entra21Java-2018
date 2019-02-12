SELECT * FROM pokemons;

DELETE FROM pokemons WHERE categoria = 'seed';

DELETE FROM pokemons WHERE nome LIKE 'NID%';

DELETE FROM pokemons WHERE categoria LIKE 'SNOW%';

DELETE FROM pokemons WHERE ataque = 2 AND defesa = 1;

DELETE FROM pokemons WHERE especial_ataque %2=0;

DELETE FROM pokemons WHERE LENGTH(nome) > 10;

DELETE FROM pokemons WHERE LENGTH(categoria) < 4;

DELETE FROM pokemons WHERE velocidade %2!=0;

DELETE FROM pokemons WHERE nome LIKE 'UNO%' OR nome LIKE 'CHARM%';

DELETE FROM pokemons WHERE categoria = 'Flower' and codigo Between 45 and 200;

DELETE FROM pokemons WHERE descricao like '%shell%';

DELETE FROM pokemons WHERE peso >= 100;

DELETE FROM pokemons WHERE altura < 1;

DELETE FROM pokemons WHERE especial_defesa > 3;

DELETE FROM pokemons WHERE LENGTH(descricao) > 150;

DELETE FROM pokemons WHERE descricao LIKE '%good%';

DELETE FROM pokemons WHERE codigo%2=0;

DELETE FROM pokemons WHERE nome = 'Lileep';

DELETE FROM pokemons WHERE especial_ataque = 5;

DELETE FROM pokemons WHERE codigo < 100;

SELEct * FROM pokemons;