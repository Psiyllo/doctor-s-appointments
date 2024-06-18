package com.example.demo.consultasmedicas.model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Paciente extends Usuario {
    @OneToMany(mappedBy = "paciente")
    private Set<Consulta> consultas;

    public Set<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(Set<Consulta> consultas) {
        this.consultas = consultas;
    }
}
