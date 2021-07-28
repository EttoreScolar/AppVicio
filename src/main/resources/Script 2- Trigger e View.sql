REM ***** TRIGGER *****

CREATE OR REPLACE TRIGGER Controla_Desconto_Joins   
BEFORE INSERT ON usuario_imagem
FOR EACH ROW
DECLARE
	preco_imagem INTEGER;
	joins_antes_desconto INTEGER;
BEGIN
	SELECT preco INTO preco_imagem FROM imagem WHERE id_imagem = :new.id_imagem;
	SELECT joins INTO joins_antes_desconto FROM usuario WHERE id_usuario = :new.id_usuario;

	IF ( joins_antes_desconto - preco_imagem < 0)
	THEN 
		raise_application_error( -20501, 'Joins insuficientes para essa transacao');
	ELSE
		UPDATE usuario SET joins = (joins_antes_desconto - preco_imagem) WHERE id_usuario = :new.id_usuario;
	END IF;
END;
/

REM ***** VIEW *****

CREATE OR REPLACE VIEW usuario_vicio AS 
	SELECT u.nome as Usuario, v.nome as Vicio, v.observacao as Observacao from vicio v, usuario u
	WHERE v.id_usuario = u.id_usuario
	ORDER BY v.id_usuario;
