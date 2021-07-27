package com.vicio.appVicio.repository;

import com.vicio.appVicio.model.UsuarioImagem;
import com.vicio.appVicio.model.UsuarioTrofeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioImagemRepository extends JpaRepository<UsuarioImagem, Integer> {
}
