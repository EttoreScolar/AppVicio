
REM ***** UPDATES *****

UPDATE endereco SET numero = 32 WHERE id_usuario = 10;

UPDATE vicio SET cor = 'vermelho' WHERE id_usuario = 10 AND id_vicio = 12;

UPDATE usuario SET email = 'joao_novo_email@testmail.com' WHERE id_usuario = 2; 

REM ***** CONSULTAS *****

REM ***** TABELA imagem *****
SELECT * FROM imagem;
REM ***** TABELA trofeu *****
SELECT * FROM trofeu;
REM ***** TABELA usuario *****
SELECT * FROM usuario;
REM ***** TABELA endereco *****
SELECT * FROM endereco;
REM ***** TABELA feedback *****
SELECT * FROM feedback;
REM ***** TABELA vicio *****
SELECT * FROM vicio;
REM ***** TABELA usuario_imagem *****
SELECT * FROM usuario_imagem;
REM ***** TABELA usuario_trofeu *****
SELECT * FROM usuario_trofeu;
REM ***** VISÃO usuario_vicio *****
SELECT * FROM usuario_vicio;

REM ***** REMOÇÃO DE TUPLAS *****

DELETE FROM vicio WHERE id_usuario = 5;

DELETE FROM usuario WHERE email like 'adelmo@testmail.com';
