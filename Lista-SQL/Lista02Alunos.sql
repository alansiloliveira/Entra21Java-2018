SELECT * FROM alunos;

SELECT nome, nota_1 FROM alunos WHERE nota_1 > 9;

SELECT nome, nota_1 'NOTA 1', nota_2 'NOTA 2', nota_3 'NOTA 3', nota_4 'NOTA 4', (nota_1 + nota_2 + nota_3 + nota_4) / 4 AS Média FROM alunos;

SELECT COUNT(signo) AS Peixes FROM alunos WHERE signo LIKE '%Peixes%';

SELECT SUM(nota_1) 'NOTA 1' FROM alunos;

SELECT AVG(nota_2) 'NOTA 2' FROM alunos;

SELECT nome, MIN(nota_1) 'NOTA MINIMA' FROM alunos WHERE nota_1 = (SELECT MIN(nota_1) FROM alunos);

SELECT nome, nota_1, nota_2, nota_3, nota_4 FROM alunos WHERE LENGTH(nome) = (SELECT MAX(LENGTH(nome)) 'MAIOR NOME' FROM alunos);

SELECT cor_preferida 'COR PREFERIDA', COUNT(cor_preferida) 'Quantidade' FROM alunos WHERE cor_preferida LIKE '%GELO%'; 

SELECT 	 COUNT(nome) 'CONTABILIZANDO' FROM alunos WHERE nome LIKE 'FRANCISCO%';

SELECT  COUNT(nome) AS Contabilizando FROM alunos WHERE nome LIKE '%LUC%';

SELECT nome, signo, data_nascimento FROM alunos WHERE signo LIKE '%ÁRIES%';

SELECT nome, nota_1, nota_2, nota_3, nota_4, (nota_1 + nota_2 + nota_3 + nota_4) / 4 'Média' FROM alunos 
WHERE (nota_1 + nota_2 + nota_3 + nota_4) / 4 = (SELECT MAX(nota_1 + nota_2 + nota_3 + nota_4) / 4 FROM alunos);

SELECT nome, (nota_1 + nota_2 + nota_3 + nota_4) / 4 AS Média, 
IF((nota_1 + nota_2 + nota_3 + nota_4) / 4 <  5 , 'Reprovado', 
IF ((nota_1 + nota_2 + nota_3 + nota_4) / 4 <  7, 'Esta em exame', 'Aprovado'))
FROM alunos;

SELECT nome, nota_1, nota_2, nota_3, nota_4, (nota_1 + nota_2 + nota_3 + nota_4) / 4 'Média' FROM alunos
WHERE (nota_1 + nota_2 + nota_3 + nota_4) / 4 = (SELECT MIN(nota_1 + nota_2 + nota_3 + nota_4) / 4 FROM alunos); 

SELECT nome, (nota_1 + nota_2 + nota_3 + nota_4) / 4 'Média' FROM alunos 
WHERE (nota_1 + nota_2 + nota_3 + nota_4) / 4 >7;

SELECT nome, nick FROM alunos WHERE LENGTH(nick) = 5;

SELECT nome, cor_preferida, (nota_1 + nota_2 + nota_3 + nota_4) / 4 'Média' FROM alunos
WHERE cor_preferida IN ('Ouro', 'Amarelo-torrado') AND (nota_1 + nota_2 + nota_3 + nota_4) / 4 > 6.5;

SELECT nome, data_nascimento FROM alunos;

SELECT nick, month(data_nascimento) FROM alunos WHERE MONTH(data_nascimento) > 06;

SELECT nome, YEAR(data_nascimento) FROM alunos WHERE YEAR(data_nascimento) = 1996;

SELECT nome, data_nascimento FROM alunos WHERE DAY(data_nascimento) = 02 
and MONTH(data_nascimento) = 02 
and (YEAR(data_nascimento) = 1964 
OR YEAR(data_nascimento) = 1994);

SELECT nick, nota_4, nota_2 FROM alunos WHERE nota_2 < 5.99 and nota_2 > 5;

SELECT nome, (nota_1 + nota_2 + nota_3 + nota_4) / 4 AS Média FROM alunos WHERE nome Like '%Josefina%';

SELECT nome, signo, nick, nota_1, nota_2, nota_3, nota_4 FROM alunos WHERE nome LIKE '%Justino%'AND signo LIKE 'A%';

SELECT AVG(nota_1 + nota_2 + nota_3 + nota_4) / 4 AS 'Média das Média' FROM alunos;
