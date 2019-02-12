SELECT * FROM alunos;

UPDATE alunos SET nota_1 = 9.9 WHERE data_nascimento LIKE '1996%';

UPDATE alunos SET nota_2 = 1.3 WHERE nome LIKE 'Urbano%';

UPDATE alunos SET numero_favorito = 55 WHERE numero_favorito%2!=0;

UPDATE alunos SET signo = 'Aries', numero_favorito = 100, cor_preferida = 'preto', nome = 'Marcela'
WHERE signo = 'Peixes';
SELECT * FROM alunos;

UPDATE alunos SET cor_preferida = 'azul', nota_2 = 9.3 WHERE cor_preferida = 'Caqui';

UPDATE alunos SET cpf = '101.947.311-89' WHERE cpf = '10194731189';

UPDATE alunos SET cor_preferida = 'Amarelo-queimado' WHERE nome LIKE '%Goes';

UPDATE alunos SET nota_1 = 1, nota_2 = 1, nota_3 = 1, nota_4 = 1 WHERE  (nota_1 + nota_2 + nota_3 + nota_4) / 4 < 4;
SELECT * FROM alunos;

UPDATE alunos SET nick = 'NINJUTSU' WHERE nick = 'Fueusn';

UPDATE alunos SET nick = 'Dobermann', cor_preferida = 'Rosa' WHERE nick = 'Saxiol';

UPDATE alunos SET data_nascimento = CONCAT(YEAR(data_nascimento), '-', MONTH(data_nascimento), '-', 30)
WHERE DAY(data_nascimento) = 31;

UPDATE alunos SET cor_preferida = 'roxo', nick = 'roxolandia' WHERE cor_preferida = 'Roxo' or cor_preferida = 'Coral';

UPDATE alunos SET data_nascimento = CONCAT(YEAR(data_nascimento), '-', 'Junho', '-', DAY(data_nascimento)) 
WHERE MONTh(data_nascimento) = 'Julho';



