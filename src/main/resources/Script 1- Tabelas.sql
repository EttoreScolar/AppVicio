REM ***** CRIANDO TABELAS *****
REM ***** TABELA usuario *****
CREATE TABLE usuario ( 
	id_usuario number(10) GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1), 
	nome varchar2 (50) not null, 
	email varchar2(100) not null, 
	data_nascimento date default sysdate not null, 
	CPF varchar2(14) CONSTRAINT cpfr_unique not null UNIQUE, 
	tipo_usuario varchar2(10) not null, 
	conectado number(1) not null, 
	joins number(7,2) default 0,
	compartilhamento INTEGER default 0,
    senha varchar2(50),
	data_cadastro date default sysdate not null, 

	CONSTRAINT pk_usuario PRIMARY KEY (id_usuario)
);

REM ***** TABELA imagem *****
CREATE TABLE imagem ( 
	id_imagem number (3) GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1), 
	nome varchar2(50) not null, 
	imagem varchar2(200) not null, 
	preco number(4) not null, 
	tipo number(1) not null,

	CONSTRAINT pk_imagem PRIMARY KEY (id_imagem) 
);

REM ***** TABELA trofeu *****
CREATE TABLE trofeu ( 
	id_tipo number(1) not null, 
	id_nivel number(1) not null, 
	descricao varchar2(200) not null, 
	id_imagem number(3) not null, 
	pre_requisito varchar2(50) not null, 
    
	CONSTRAINT pk_trofeu PRIMARY KEY (id_tipo, id_nivel),

	CONSTRAINT fk_trofeu_imagem
	FOREIGN KEY (id_imagem)
	REFERENCES imagem(id_imagem)
);


REM ***** TABELA usuario_trofeu *****
CREATE TABLE usuario_trofeu ( 
	id_usuario number(10) not null,
	id_tipo number(1) not null,
	id_nivel number(1) not null,

	CONSTRAINT pk_usuario_trofeu PRIMARY KEY (id_usuario, id_tipo, id_nivel),

	CONSTRAINT fk_ut_id_usuario
	FOREIGN KEY (id_usuario)
	REFERENCES usuario(id_usuario)
    ON DELETE CASCADE,

	CONSTRAINT fk_ut_trofeu
	FOREIGN KEY (id_tipo, id_nivel)
	REFERENCES trofeu(id_tipo, id_nivel)
);

REM ***** TABELA usuario_imagem *****
CREATE TABLE usuario_imagem ( 
	id_usuario number(10) not null,
	id_imagem number(3) not null,
    status smallint check (status in (0,1)),
    
	CONSTRAINT pk_usuario_imagem PRIMARY KEY (id_usuario, id_imagem),

	CONSTRAINT fk_ui_id_usuario
	FOREIGN KEY (id_usuario)
	REFERENCES usuario(id_usuario)
    ON DELETE CASCADE,

	CONSTRAINT fk_ui_imagem
	FOREIGN KEY (id_imagem)
	REFERENCES imagem(id_imagem)
);

REM ***** TABELA vicio *****
CREATE TABLE vicio (
	id_vicio number(10) GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
	id_usuario number(10) not null,
	data_fim date default sysdate not null,
	data_inicio date default sysdate not null,
	cor varchar2(20) not null,
	observacao varchar2(500) not null,
	nome varchar2(50) not null,
	
	CONSTRAINT pk_vicio PRIMARY KEY (id_vicio, id_usuario),

	CONSTRAINT verifica_cor CHECK (cor IN ('azul', 'laranja', 'verde', 'amarelo', 'vermelho', 'rosa', 'violeta' ,'aqua')),

	CONSTRAINT fk_vicio_usuario
	FOREIGN KEY (id_usuario)
	REFERENCES usuario(id_usuario)
    ON DELETE CASCADE
);

REM ***** TABELA endereco *****
CREATE TABLE endereco (
	id_usuario number(10) not null,
	estado char(2),
	cidade varchar2(30),
	CEP char(8),
	numero number,
	rua varchar2(100),

    CONSTRAINT pk_endereco PRIMARY KEY (id_usuario),

	CONSTRAINT fk_endereco_usuario
	FOREIGN KEY (id_usuario)
	REFERENCES usuario(id_usuario)
    ON DELETE CASCADE
);

REM ***** TABELA feedback *****
CREATE TABLE feedback (
	id_feedback number(10) GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
	id_usuario number(10) not null,
	tipo number(1) not null,
	data_envio date default sysdate not null,
	mensagem varchar2(1000) not null,

	CONSTRAINT pk_feedback PRIMARY KEY (id_feedback, id_usuario),

	CONSTRAINT fk_feedback_usuario
	FOREIGN KEY (id_usuario)
	REFERENCES usuario(id_usuario)
    ON DELETE CASCADE
);	