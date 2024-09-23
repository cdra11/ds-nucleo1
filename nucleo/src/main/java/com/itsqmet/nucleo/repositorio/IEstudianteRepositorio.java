package com.itsqmet.nucleo.repositorio;

import com.itsqmet.nucleo.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepositorio extends JpaRepository<Estudiante,Integer> {
}
