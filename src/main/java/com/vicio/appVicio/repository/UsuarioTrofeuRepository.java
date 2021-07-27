package com.vicio.appVicio.repository;

import com.vicio.appVicio.model.Trofeu;
import com.vicio.appVicio.model.UsuarioTrofeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioTrofeuRepository extends JpaRepository<UsuarioTrofeu, Integer> {
}
