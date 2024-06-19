package com.example.demo.consultasmedicas.repository;

import com.example.demo.consultasmedicas.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
