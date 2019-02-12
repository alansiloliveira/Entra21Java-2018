PESSOAS 
nome          Linguagem
Francisco     Java
Crispim       Java
Leornado      Pascal
Marcio P      Pascal
Marcio A	  Php
Rafael        C++

SELECT linguagem, COUNT(nome)
FROM pessoas
GROUP BY linguagem
ORDER BY COUNT(nome) DESC;
 
NOME     QUANTIDADE
Java	 2
Pascal	 2
PHP      1
C++      1