package com.vicio.appVicio.repository;

import com.vicio.appVicio.model.Endereco;
import com.vicio.appVicio.model.UsuarioImagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    @Query(
            value = "select * from endereco u where u.id_usuario = :id_usuario",
            nativeQuery = true
    )
    Endereco buscaIdUsuario (@Param("id_usuario") Integer var1);

    @Query(
            value = "select * from endereco u where u.id_endereco = :id_endereco",
            nativeQuery = true
    )
    Endereco buscaEnderecoId (@Param("id_endereco") Integer var1);
}
