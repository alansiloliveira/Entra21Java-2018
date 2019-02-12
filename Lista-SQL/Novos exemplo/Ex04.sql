USE joguinho;
SELECT habilidades.nome 'Habilidade', campeoes.nome 'Campeão'
FROM habilidades
JOIN campeoes ON(habilidades.id_Campeao = campeoes.id);