package com.example.demo.consultasmedicas.service;

import com.example.demo.consultasmedicas.model.Consulta;
import com.example.demo.consultasmedicas.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;

    public Consulta criarConsulta(Consulta consulta) {
        // Implemente a lógica para criar uma consulta
        return consultaRepository.save(consulta);
    }

    public Optional<Consulta> obterConsultaPorId(Long id) {
        // Implemente a lógica para obter uma consulta por ID
        return consultaRepository.findById(id);
    }

    public List<Consulta> obterTodasConsultas() {
        // Implemente a lógica para obter todas as consultas
        return consultaRepository.findAll();
    }

    public void deletarConsulta(Long id) {
        // Implemente a lógica para deletar uma consulta por ID
        consultaRepository.deleteById(id);
    }
}
