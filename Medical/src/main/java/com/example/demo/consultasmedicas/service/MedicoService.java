package com.example.demo.consultasmedicas.service;

import com.example.demo.consultasmedicas.model.Medico;
import com.example.demo.consultasmedicas.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository medicoRepository;

    public Medico criarMedico(Medico medico) {
        // Implemente a lógica para criar um médico
        return medicoRepository.save(medico);
    }

    public Optional<Medico> obterMedicoPorId(Long id) {
        // Implemente a lógica para obter um médico por ID
        return medicoRepository.findById(id);
    }

    public List<Medico> obterTodosMedicos() {
        // Implemente a lógica para obter todos os médicos
        return medicoRepository.findAll();
    }

    public void deletarMedico(Long id) {
        // Implemente a lógica para deletar um médico por ID
        medicoRepository.deleteById(id);
    }
}
