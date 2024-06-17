package com.example.demo;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class medical_appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private doctor medico;

    @ManyToOne
    private patient paciente;

    private LocalDateTime dataHora;

    private String notas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public doctor getMedico() {
        return medico;
    }

    public void setMedico(doctor medico) {
        this.medico = medico;
    }

    public patient getPaciente() {
        return paciente;
    }

    public void setPaciente(patient paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
