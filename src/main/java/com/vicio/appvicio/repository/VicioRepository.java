package com.vicio.appvicio.repository;


import com.vicio.appvicio.model.Vicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VicioRepository extends JpaRepository<Vicio, Integer> {
}
