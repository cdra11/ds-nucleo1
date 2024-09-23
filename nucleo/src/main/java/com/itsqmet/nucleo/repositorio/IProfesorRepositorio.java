package com.itsqmet.nucleo.repositorio;

import com.itsqmet.nucleo.modelo.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorRepositorio extends JpaRepository<Profesor,Integer> {
}
