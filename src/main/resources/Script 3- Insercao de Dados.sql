
REM ***** INSERINDO DADOS *****

REM ***** DADOS IMAGEM *****
REM ***** DESC: TIPO 1(AVATAR), 2(WALLPAPER), 3(TROFEU) ****
insert into imagem (nome, imagem, preco, tipo)
values ('Avatar garota', 'avatar-garota.png', 100, 1);

insert into imagem (nome, imagem, preco, tipo)
values ('Avatar garoto', 'avatar-garoto.png', 100, 1);

insert into imagem (nome, imagem, preco, tipo)
values ('Avatar gatinho', 'avatar-gatinho.png', 150, 1);

insert into imagem (nome, imagem, preco, tipo)
values ('Avatar cachorro', 'avatar-cachorro.png', 150, 1);

insert into imagem (nome, imagem, preco, tipo)
values ('Avatar padrao', 'avatar-padrao.png', 10, 1);

insert into imagem (nome, imagem, preco, tipo)
values ('Capa nuvem', 'capa-nuvem.png', 50, 2);

insert into imagem (nome, imagem, preco, tipo)
values ('Capa coração', 'capa-coracao.png', 50, 2);

insert into imagem (nome, imagem, preco, tipo)
values ('Capa arco-íris', 'capa-arcoiris.png', 100, 2);

insert into imagem (nome, imagem, preco, tipo)
values ('Capa chuva', 'capa-chuva.png', 50, 2);

insert into imagem (nome, imagem, preco, tipo)
values ('Capa padrão', 'capa-padrao.png', 10, 2);

insert into imagem (nome, imagem, preco, tipo)
values ('Trofeu dinheiro bronze', 'trofeu-dinheiro-ouro.png', 0, 3);

insert into imagem (nome, imagem, preco, tipo)
values ('Trofeu dinheiro prata', 'trofeu-dinheiro-prata.png', 0, 3);

insert into imagem (nome, imagem, preco, tipo)
values ('Trofeu dinheiro ouro', 'trofeu-dinheiro-bronze.png', 0, 3);

insert into imagem (nome, imagem, preco, tipo)
values ('Trofeu compartilhamento bronze', 'trofeu-comp-ouro.png', 0, 3);

insert into imagem (nome, imagem, preco, tipo)
values ('Trofeu compartilhamento prata', 'trofeu-comp-prata.png', 0, 3);

insert into imagem (nome, imagem, preco, tipo)
values ('Trofeu compartilhamento ouro', 'trofeu-comp-bronze.png', 0, 3);

insert into imagem (nome, imagem, preco, tipo)
values ('Trofeu tempo bronze', 'trofeu-comp-ouro.png', 0, 3);

insert into imagem (nome, imagem, preco, tipo)
values ('Trofeu tempo prata', 'trofeu-comp-prata.png', 0, 3);

insert into imagem (nome, imagem, preco, tipo)
values ('Trofeu tempo ouro', 'trofeu-comp-bronze.png', 0, 3);

REM ***** DADOS TROFEU *****
insert into trofeu (id_tipo, id_nivel, descricao, pre_requisito, id_imagem)
values (1, 1, 'Troféu de Dinheiro - Bronze', 'Acumular 50 joins', 11);

insert into trofeu (id_tipo, id_nivel, descricao, pre_requisito, id_imagem)
values (1, 2, 'Troféu de Dinheiro - Prata', 'Acumular 100 joins', 12);

insert into trofeu (id_tipo, id_nivel, descricao, pre_requisito, id_imagem)
values (1, 3, 'Troféu de Dinheiro - Ouro', 'Acumular 200 joins', 13);

insert into trofeu (id_tipo, id_nivel, descricao, pre_requisito, id_imagem)
values (2, 1, 'Troféu de Compartilhamento - Bronze', 'Compartilhar para 3 amigos', 14);

insert into trofeu (id_tipo, id_nivel, descricao, pre_requisito, id_imagem)
values (2, 2, 'Troféu de Compartilhamento - Prata', 'Compartilhar para 5 amigos', 15);

insert into trofeu (id_tipo, id_nivel, descricao, pre_requisito, id_imagem)
values (2, 3, 'Troféu de Compartilhamento - Ouro', 'Compartilhar para 10 amigos', 16);

insert into trofeu (id_tipo, id_nivel, descricao, pre_requisito, id_imagem)
values (3, 1, 'Troféu de Tempo - Bronze', 'Uma semana de sucesso', 17);

insert into trofeu (id_tipo, id_nivel, descricao, pre_requisito, id_imagem)
values (3, 2, 'Troféu de Tempo - Prata', 'Um mês de sucesso', 18);

insert into trofeu (id_tipo, id_nivel, descricao, pre_requisito, id_imagem)
values (3, 3, 'Troféu de Tempo - Ouro', 'Um ano de sucesso', 19);

REM ***** DADOS USUÁRIO *****
INSERT INTO usuario (nome, email, data_nascimento, cpf, tipo_usuario, conectado, joins)
VALUES ('Ettore', 'ettore@ettore.com', to_date('12/11/1998','dd/mm/yyyy'),'43539626967', 'C', 0, 50);

INSERT INTO usuario (nome, email, data_nascimento, cpf, tipo_usuario, conectado, joins)
VALUES ('Joao', 'Joao@Joao.com', to_date('12/11/2005','dd/mm/yyyy'),'43529626967', 'C', 0, 10);

INSERT INTO usuario (nome, email, data_nascimento, cpf, tipo_usuario, conectado, joins)
VALUES ('Casemiro', 'Casemiro@Casemiro.com', to_date('05/05/2000','dd/mm/yyyy'),'123456789', 'A', 0, 10);

INSERT INTO usuario (nome, email, data_nascimento, cpf, tipo_usuario, conectado, joins)
VALUES ('Kleber', 'Kleber@Kleber.com', to_date('04/05/2010','dd/mm/yyyy'),'987654321', 'C', 0, 50);

INSERT INTO usuario (nome, email, data_nascimento, cpf, tipo_usuario, conectado, joins)
VALUES ('Dark', 'Dark@Dark.com', to_date('01/06/2011','dd/mm/yyyy'),'147852369', 'C', 0, 15.5);

INSERT INTO usuario (nome, email, data_nascimento, cpf, tipo_usuario, conectado, joins)
VALUES ('Roger', 'Roger@Roger.com', to_date('10/06/1990','dd/mm/yyyy'),'369852147', 'C', 0, 5);

INSERT INTO usuario (nome, email, data_nascimento, cpf, tipo_usuario, conectado, joins)
VALUES ('Mozhi', 'Mozhi@Mozhi.com', to_date('04/08/1995','dd/mm/yyyy'),'258741369', 'A', 0, 0);

INSERT INTO usuario (nome, email, data_nascimento, cpf, tipo_usuario, conectado, joins)
VALUES ('Trevis', 'Trevis@Trevis.com', to_date('02/09/1993','dd/mm/yyyy'),'231654985', 'C', 0, 0);

INSERT INTO usuario (nome, email, data_nascimento, cpf, tipo_usuario, conectado, joins)
VALUES ('Clark', 'Clark@Clark.com', to_date('03/01/1978','dd/mm/yyyy'),'523698741', 'C', 0, 0);

INSERT INTO usuario (nome, email, data_nascimento, cpf, tipo_usuario, conectado, joins, data_cadastro)
VALUES ('Robo', 'Robo@Robo.com', to_date('02/09/1995','dd/mm/yyyy'),'1478526547', 'C', 0, 600, '01-JAN-2020');

INSERT INTO usuario (nome, email, data_nascimento, cpf, tipo_usuario, conectado, joins)
VALUES ('Adelmo', 'adelmo@testmail.com', to_date('08/08/1989','dd/mm/yyyy'),'32155244687', 'C', 0, 0);

REM ***** DADOS ENDERECO *****
INSERT INTO endereco (id_usuario, estado , cidade ,	CEP , numero, rua)
VALUES (10, 'SP', 'Bauru', 17000123, 22, 'Rua dos Robos');

REM ***** DADOS USUARIO_IMAGEM *****
INSERT INTO usuario_imagem (id_usuario, id_imagem, status)
VALUES (10,4,1);

REM ***** DADOS USUARIO_TROFEU *****
INSERT INTO usuario_trofeu (id_usuario, id_tipo, id_nivel)
VALUES (1,1,1);

INSERT INTO usuario_trofeu (id_usuario, id_tipo, id_nivel)
VALUES (4,1,1);

INSERT INTO usuario_trofeu (id_usuario, id_tipo, id_nivel)
VALUES (10,1,1);

INSERT INTO usuario_trofeu (id_usuario, id_tipo, id_nivel)
VALUES (10,1,2);

INSERT INTO usuario_trofeu (id_usuario, id_tipo, id_nivel)
VALUES (10,1,3);

INSERT INTO usuario_trofeu (id_usuario, id_tipo, id_nivel)
VALUES (10,3,1);

INSERT INTO usuario_trofeu (id_usuario, id_tipo, id_nivel)
VALUES (10,3,2);

INSERT INTO usuario_trofeu (id_usuario, id_tipo, id_nivel)
VALUES (10,3,3);

REM ***** DADOS VÍCIO *****
INSERT INTO vicio (id_usuario, nome, observacao, cor, data_inicio, data_fim)
VALUES (3, 'Doces', 'Reduzir o consumo de doces para 50g ao dia', 'amarelo', '01-JUN-2021', '01-JUN-2022');

INSERT INTO vicio (id_usuario, nome, observacao, cor, data_inicio, data_fim)
VALUES (2, 'Bebidas', 'Beber apenas de final de semana.', 'vermelho', '01-JAN-2021', '01-JAN-2022');

INSERT INTO vicio (id_usuario, nome, observacao, cor, data_inicio, data_fim)
VALUES (1, 'Redes Sociais', 'Não utilizar redes sociais.', 'vermelho', '05-JUN-2021', '31-DEC-2021');

INSERT INTO vicio (id_usuario, nome, observacao, cor, data_inicio, data_fim)
VALUES (4, 'Doces', 'Ficar sem comer doces.', 'verde', '01-JAN-2021', '01-JAN-2022');

INSERT INTO vicio (id_usuario, nome, observacao, cor, data_inicio, data_fim)
VALUES (5, 'Dormir tarde.', 'Não dormir tarde', 'azul', '01-JAN-2021', '01-JAN-2022');

INSERT INTO vicio (id_usuario, nome, observacao, cor, data_inicio, data_fim)
VALUES (7, 'Desperdiçar dinheiro', 'Não comprar coisas desnecessárias.', 'azul', '09-APR-2021', '01-OCT-2021');

INSERT INTO vicio (id_usuario, nome, observacao, cor, data_inicio, data_fim)
VALUES (8, 'Videogames', 'Não jogar videogames.', 'violeta', '25-JAN-2021', '25-JUL-2021');

INSERT INTO vicio (id_usuario, nome, observacao, cor, data_inicio, data_fim)
VALUES (8, 'Palavrões', 'Não falar palavrões.', 'aqua', '24-JUL-2021', '01-AUG-2022');

INSERT INTO vicio (id_usuario, nome, observacao, cor, data_inicio, data_fim)
VALUES (9, 'Cigarro', 'Não fumar.', 'rosa', '01-JAN-2021', '01-JAN-2022');

INSERT INTO vicio (id_usuario, nome, observacao, cor, data_inicio, data_fim)
VALUES (10, 'Celular', 'Não usar o celular depois das 21h.', 'verde', '25-JAN-2021', '25-JUL-2021');

INSERT INTO vicio (id_usuario, nome, observacao, cor, data_inicio, data_fim)
VALUES (10, 'Redes Sociais', 'Não utilizar redes sociais.', 'vermelho', '05-JUN-2021', '31-DEC-2021');

INSERT INTO vicio (id_usuario, nome, observacao, cor, data_inicio, data_fim)
VALUES (10, 'Videogames', 'Não jogar videogames.', 'violeta', '25-JAN-2021', '25-JUL-2021');

REM ***** DADOS FEEDBACK *****
INSERT INTO feedback (id_usuario, tipo, mensagem)
VALUES (2, 1, 'O aplicativo está me ajudando a controlar meus maus hábitos. Obrigado.');

INSERT INTO feedback (id_usuario, tipo, mensagem)
VALUES (8, 0, 'Estou gostando.');