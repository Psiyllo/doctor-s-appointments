package com.example.demo.consultasmedicas.repository;

import com.example.demo.consultasmedicas.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
