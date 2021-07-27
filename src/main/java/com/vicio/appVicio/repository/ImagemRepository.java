package com.vicio.appVicio.repository;

import com.vicio.appVicio.model.Imagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagemRepository extends JpaRepository<Imagem,Integer> {
}
