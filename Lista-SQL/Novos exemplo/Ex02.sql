SELECT * FROM usuarios;

SELECT * FROM salas_de_aula;

SELECT 
	usuarios.nome 'Aluno',
	salas_de_aula.nome 'Sala'
FROM usuarios
JOIN salas_de_aula ON(usuarios.id_sala_de_aula = salas_de_aula.id);