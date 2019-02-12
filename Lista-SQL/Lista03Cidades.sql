SELECT * FROM cidades; 

UPDATE cidades SET estado = 'SS' WHERE estado = 'SC';

UPDATE cidades SET cidade = 'Brumenau', estado = 'SC' WHERE cidade = 'Blumenau';
SELECT cidade, estado FROM cidades;

UPDATE cidades SET cidade = 'BATATA' WHERE cidade LIKE 'BATA%';

UPDATE cidades SET cidade = 'Lindo' WHERE cidade LIKE 'Belo%';

UPDATE cidades SET estado = 'SC' WHERE cidade LIKE 'Indaia%';

UPDATE cidades SET estado = 'SC' WHERE cidade = 'Timbo';

UPDATE cidades SET cidade = 'Josué' WHERE cidade LIKE '%Jose%';

UPDATE cidades SET estado = 'PS' WHERE estado LIKE '%SP%';

UPDATE cidades SET cidade = 'Oi, tudo bem' WHERE LENGTH(cidade) > 10;
SELECT cidade FROM cidades;

UPDATE cidades SET cidade = 'IT' WHERE cidade LIKE 'IT%';

UPDATE cidades SET estado = 'TO' WHERE cidade LIKE '%ã'; 