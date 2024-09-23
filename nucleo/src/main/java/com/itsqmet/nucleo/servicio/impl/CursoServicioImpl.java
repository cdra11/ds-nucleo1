package com.itsqmet.nucleo.servicio.impl;

import com.itsqmet.nucleo.modelo.Curso;
import com.itsqmet.nucleo.repositorio.ICursoRepositorio;
import com.itsqmet.nucleo.servicio.ICursoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CursoServicioImpl implements ICursoServicio {
    @Autowired
    private ICursoRepositorio cursoRepositorio;

    @Override
    public void insertarCurso(Curso nuevoCurso) {
        cursoRepositorio.save(nuevoCurso);
    }

    @Override
    public List<Curso> listarCursos() {
        return cursoRepositorio.findAll();
    }

    @Override
    public Curso obtenerCursoPorId(Integer id) {
        return cursoRepositorio.findById(id).orElse(null);
    }

    @Override
    public void actualizarCurso(Curso cursoActualizado) {
        cursoRepositorio.save(cursoActualizado);
    }

    @Override
    public void eliminarCurso(Integer id) {
        cursoRepositorio.deleteById(id);
    }
}
