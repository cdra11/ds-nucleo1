package com.itsqmet.nucleo.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
public class Aula implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idAula;
    private String nombreAula;
    private String capacidad;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Curso curso;
}
