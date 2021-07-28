package com.vicio.appvicio.repository;

import com.vicio.appvicio.model.Imagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagemRepository extends JpaRepository<Imagem,Integer> {
}
