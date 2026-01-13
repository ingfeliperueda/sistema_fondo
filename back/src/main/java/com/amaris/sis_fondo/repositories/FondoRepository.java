package com.amaris.sis_fondo.repositories;

import com.amaris.sis_fondo.entities.Fondo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FondoRepository extends JpaRepository<Fondo, Long> {


}
