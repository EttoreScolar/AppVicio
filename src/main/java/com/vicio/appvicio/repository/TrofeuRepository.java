package com.vicio.appvicio.repository;

import com.vicio.appvicio.model.Trofeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrofeuRepository extends JpaRepository<Trofeu, Integer> {
}
