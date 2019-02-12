SELECT * FROM alunos;

DELETE FROM alunos WHERE nome LIKE '%Francisco%';

DELETE FROM alunos WHERE data_nascimento LIKE '%1994%';

DELETE FROM alunos WHERE signo = 'Gemeos';

DELETE FROM alunos WHERE nome LIKE 'Reinaldo%';

DELETE FROM alunos WHERE nome LIKE '%Carvalho';

DELETE FROM alunos WHERE MONTH(data_nascimento) = 07;

DELETE FROM alunos WHERE nota_1 > nota_2 and nota_4 < nota_3;

DELETE FROM alunos WHERE cpf LIKE '145%';

DELETE FROM alunos WHERE cor_preferida = 'Bordo' and signo = 'Capricornio' or cor_preferida = 'Cinza-claro' and signo = 'Aquarios';

DELETE FROM alunos WHERE (nota_1 + nota_2 + nota_3 + nota_4) / 4 < 4;

DELETE FROM alunos WHERE DAY(data_nascimento) = 28;

SELECT * FROM alunos;