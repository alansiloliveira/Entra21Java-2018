SELECT * FROM cidades;

SELECT * FROM cidades WHERE cidade LIKE 'A%';

SELECT * FROM cidades WHERE cidade LIKE '%apar%';

SELECT * FROM cidades WHERE cidade LIKE 'W%';

SELECT cidade, estado FROM cidades WHERE cidade LIKE '%tuba' ORDER BY estado DESC;

SELECT cidade FROM cidades WHERE LENGTH(cidade) > 15 ORDER BY cidade DESC;

SELECT COUNT(cidade) 'Quantidade' FROM cidades WHERE estado LIKE 'SC';

SELECT COUNT(cidade) AS Quantidade FROM cidades WHERE estado = 'SP';

SELECT Cidade, LENGTH(cidade) AS Tamanho FROM cidades WHERE LENGTH(cidade) = 10;