package com.vicio.appVicio.repository;

import com.vicio.appVicio.model.Feedback;
import com.vicio.appVicio.model.UsuarioImagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
    @Query(
            value = "select * from feedback u where u.id_usuario = :id_usuario",
            nativeQuery = true
    )
    Feedback buscaIdUsuario (@Param("id_usuario") Integer var1);
}
