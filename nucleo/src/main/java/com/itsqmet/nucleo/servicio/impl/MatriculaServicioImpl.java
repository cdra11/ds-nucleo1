package com.itsqmet.nucleo.servicio.impl;

import com.itsqmet.nucleo.modelo.Matricula;
import com.itsqmet.nucleo.repositorio.IMatriculaRepositorio;
import com.itsqmet.nucleo.servicio.IMatriculaServicio;
import org.springframework.stereotype.Service;
import com.itsqmet.nucleo.servicio.IMatriculaServicio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service

public class MatriculaServicioImpl implements IMatriculaServicio {

    @Autowired
    private IMatriculaRepositorio matriculaRepositorio;

    @Override
    public void insertarMatricula(Matricula nuevaMatricula) {
        matriculaRepositorio.save(nuevaMatricula);
    }

    @Override
    public List<Matricula> listarMatriculas() {
        return matriculaRepositorio.findAll();
    }

    @Override
    public Matricula obtenerMatriculaPorId(Integer id) {
        return matriculaRepositorio.findById(id).orElse(null); // Manejo de valor opcional
    }

    @Override
    public void actualizarMatricula(Matricula matriculaActualizada) {
        matriculaRepositorio.save(matriculaActualizada); // Save actúa como "insertar" o "actualizar"
    }

    @Override
    public void eliminarMatricula(Integer id) {
        matriculaRepositorio.deleteById(id);
    }
}
