package com.example.demo.consultasmedicas.repository;

import com.example.demo.consultasmedicas.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
