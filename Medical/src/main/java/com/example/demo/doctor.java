package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class doctor extends users {
    private String especialidade;

    @OneToMany(mappedBy = "medico")
    private Set<medical_appointment> consultas;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Set<medical_appointment> getConsultas() {
        return consultas;
    }

    public void setConsultas(Set<medical_appointment> consultas) {
        this.consultas = consultas;
    }
}