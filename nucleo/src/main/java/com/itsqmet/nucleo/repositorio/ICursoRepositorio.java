package com.itsqmet.nucleo.repositorio;

import com.itsqmet.nucleo.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepositorio extends JpaRepository<Curso,Integer> {
}
