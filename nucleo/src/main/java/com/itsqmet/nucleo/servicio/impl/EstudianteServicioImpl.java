package com.itsqmet.nucleo.servicio.impl;

import com.itsqmet.nucleo.modelo.Estudiante;
import com.itsqmet.nucleo.repositorio.IEstudianteRepositorio;
import com.itsqmet.nucleo.servicio.IEstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicioImpl implements IEstudianteServicio {

    @Autowired
    private IEstudianteRepositorio estudianteRepositorio;

    @Override
    public void insertarEstudiante(Estudiante nuevoEstudiante) {
        estudianteRepositorio.save(nuevoEstudiante);
    }

    @Override
    public List<Estudiante> listarEstudiantes() {
        return estudianteRepositorio.findAll();
    }

    @Override
    public Estudiante obtenerEstudiantePorId(Integer id) {
        return estudianteRepositorio.findById(id).orElse(null); // Manejo de valor opcional
    }

    @Override
    public void actualizarEstudiante(Estudiante estudianteActualizado) {
        estudianteRepositorio.save(estudianteActualizado); // Save actúa como "insertar" o "actualizar"
    }

    @Override
    public void eliminarEstudiante(Integer id) {
        estudianteRepositorio.deleteById(id);
    }
}
