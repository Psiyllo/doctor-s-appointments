package com.example.demo.consultasmedicas.repository;

import com.example.demo.consultasmedicas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
