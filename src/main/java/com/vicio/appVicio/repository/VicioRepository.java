package com.vicio.appVicio.repository;


import com.vicio.appVicio.model.Endereco;
import com.vicio.appVicio.model.Vicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VicioRepository extends JpaRepository<Vicio, Integer> {
    @Query(
            value = "select * from vicio u where u.id_usuario = :id_usuario",
            nativeQuery = true
    )
    Vicio buscaIdUsuario (@Param("id_usuario") Integer var1);
}
