package com.vicio.appVicio.repository;

import com.vicio.appVicio.model.Trofeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrofeuRepository extends JpaRepository<Trofeu, Integer> {
}
