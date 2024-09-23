package com.itsqmet.nucleo.repositorio;

import com.itsqmet.nucleo.modelo.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMatriculaRepositorio extends JpaRepository<Matricula,Integer> {
}
