package com.itsqmet.nucleo.servicio.impl;

import com.itsqmet.nucleo.modelo.Profesor;
import com.itsqmet.nucleo.repositorio.IProfesorRepositorio;
import com.itsqmet.nucleo.servicio.IProfesorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class ProfesorServicioImpl implements IProfesorServicio {
    @Autowired
    private IProfesorRepositorio profesorRepositorio;

    @Override
    public void insertarProfesor(Profesor nuevo) {
        profesorRepositorio.save(nuevo);
    }

    @Override
    public List<Profesor> listarProfesores() {
        return profesorRepositorio.findAll();
    }

    @Override
    public Profesor obtenerProfesorPorId(Integer id) {
        return profesorRepositorio.findById(id).orElse(null); // Manejo de valor opcional
    }

    @Override
    public void actualizarProfesor(Profesor profesorActualizado) {
        profesorRepositorio.save(profesorActualizado); // Save actúa como "insertar" o "actualizar"
    }

    @Override
    public void eliminarProfesor(Integer id) {
        profesorRepositorio.deleteById(id);
    }
}
