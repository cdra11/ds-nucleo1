package com.itsqmet.nucleo.modelo;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Estudiante implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    @DateTimeFormat
    private String fechaNacimiento;
    private String correo;
    @OneToMany(mappedBy = "fkMatricula")
    private List<Matricula> listamatricula=new ArrayList<>();

}
