package com.example.demo.consultasmedicas.controller;

import com.example.demo.consultasmedicas.model.Consulta;
import com.example.demo.consultasmedicas.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/consultas")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public Consulta criarConsulta(@RequestBody Consulta consulta) {
        return consultaService.criarConsulta(consulta);
    }

    @GetMapping("/{id}")
    public Optional<Consulta> obterConsultaPorId(@PathVariable Long id) {
        return consultaService.obterConsultaPorId(id);
    }

    @GetMapping
    public List<Consulta> obterTodasConsultas() {
        return consultaService.obterTodasConsultas();
    }

    @DeleteMapping("/{id}")
    public void deletarConsulta(@PathVariable Long id) {
        consultaService.deletarConsulta(id);
    }
}
