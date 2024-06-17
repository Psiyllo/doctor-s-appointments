package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class patient extends users {
    @OneToMany(mappedBy = "paciente")
    private Set<medical_appointment> consultas;

    public Set<medical_appointment> getConsultas() {
        return consultas;
    }

    public void setConsultas(Set<medical_appointment> consultas) {
        this.consultas = consultas;
    }
}