package com.itsqmet.nucleo.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
public class Matricula implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMatricula;
    private String nombre;
    @ManyToOne
    @JoinColumn(name="fkMatEst")
    private Estudiante fkMatricula;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
}
