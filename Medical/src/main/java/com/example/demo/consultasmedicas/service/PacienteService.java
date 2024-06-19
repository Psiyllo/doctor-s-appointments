package com.example.demo.consultasmedicas.service;

import com.example.demo.consultasmedicas.model.Paciente;
import com.example.demo.consultasmedicas.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente criarPaciente(Paciente paciente) {
        // Implemente a lógica para criar um paciente
        return pacienteRepository.save(paciente);
    }

    public Optional<Paciente> obterPacientePorId(Long id) {
        // Implemente a lógica para obter um paciente por ID
        return pacienteRepository.findById(id);
    }

    public List<Paciente> obterTodosPacientes() {
        // Implemente a lógica para obter todos os pacientes
        return pacienteRepository.findAll();
    }

    public void deletarPaciente(Long id) {
        // Implemente a lógica para deletar um paciente por ID
        pacienteRepository.deleteById(id);
    }
}
