package com.vicio.appVicio.repository;

import com.vicio.appVicio.model.Trofeu;
import com.vicio.appVicio.model.UsuarioImagem;
import com.vicio.appVicio.model.UsuarioTrofeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioTrofeuRepository extends JpaRepository<UsuarioTrofeu, Integer> {
    @Query(
            value = "select * from usuario_trofeu u where u.id_usuario = :id_usuario and u.id_tipo = :id_tipo and u.id_nivel = :id_nivel",
            nativeQuery = true
    )
    UsuarioTrofeu buscaIdUsuarioTipoNivel (@Param("id_usuario") Integer var1, @Param("id_tipo") Integer var2, @Param("id_nivel") Integer var3);

    @Query(
            value = "select * from usuario_trofeu u where u.id_usuario = :id_usuario and u.id_tipo = :id_tipo",
            nativeQuery = true
    )
    UsuarioTrofeu buscaIdUsuarioTipo (@Param("id_usuario") Integer var1, @Param("id_tipo") Integer var2);

    @Query(
            value = "select * from usuario_trofeu u where u.id_usuario = :id_usuario and u.id_nivel = :id_nivel",
            nativeQuery = true
    )
    UsuarioTrofeu buscaIdUsuarioNivel (@Param("id_usuario") Integer var1, @Param("id_nivel") Integer var2);
}
