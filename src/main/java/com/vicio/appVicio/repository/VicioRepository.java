package com.vicio.appVicio.repository;


import com.vicio.appVicio.model.Vicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VicioRepository extends JpaRepository<Vicio, Integer> {
}
