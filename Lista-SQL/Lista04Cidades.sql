SELECT * FROM cidades;

DELETE FROM cidades WHERE estado = 'RS';

DELETE FROM cidades WHERE estado = 'AC' and cidade LIKE 'r%';

DELETE FROM cidades WHERE cidade LIKE '%GOAS';

DELETE FROM cidades WHERE cidade LIKE '%irmãos';

DELETE FROM cidades WHERE estado = 'MG';

DELETE FROM cidades WHERE cidade = 'Douradina';

SELECT * FROM cidades;