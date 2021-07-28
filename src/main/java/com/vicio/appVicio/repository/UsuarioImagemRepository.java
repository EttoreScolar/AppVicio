package com.vicio.appVicio.repository;

import com.vicio.appVicio.model.UsuarioImagem;
import com.vicio.appVicio.model.UsuarioTrofeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioImagemRepository extends JpaRepository<UsuarioImagem, Integer> {
    @Query(
            value = "select * from usuario_imagem u where u.id_usuario = :id_usuario and u.id_imagem = :id_imagem",
            nativeQuery = true
    )
    UsuarioImagem buscaIdUsuarioImagem (@Param("id_usuario") Integer var1, @Param("id_imagem") Integer var2);

    @Query(
            value = "select * from usuario_imagem u where u.id_usuario = :id_usuario",
            nativeQuery = true
    )
    UsuarioImagem buscaIdUsuario (@Param("id_usuario") Integer var1);

    @Query(
            value = "select * from usuario_imagem u where u.id_imagem = :id_imagem",
            nativeQuery = true
    )
    UsuarioImagem buscaIdImagem (@Param("id_imagem") Integer var1);
}
