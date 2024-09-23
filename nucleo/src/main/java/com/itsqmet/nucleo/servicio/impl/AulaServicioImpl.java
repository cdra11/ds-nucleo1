package com.itsqmet.nucleo.servicio.impl;

import com.itsqmet.nucleo.modelo.Aula;
import com.itsqmet.nucleo.repositorio.IAulaRepositorio;
import com.itsqmet.nucleo.servicio.IAulaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class AulaServicioImpl implements IAulaServicio {
    @Autowired
    private IAulaRepositorio aulaRepositorio;

    @Override
    public void insertarAula(Aula nuevaAula) {
        aulaRepositorio.save(nuevaAula);
    }

    @Override
    public List<Aula> listarAulas() {
        return aulaRepositorio.findAll();
    }

    @Override
    public Aula obtenerAulaPorId(Integer id) {
        return aulaRepositorio.findById(id).orElse(null); // Manejo de valor opcional
    }

    @Override
    public void actualizarAula(Aula aulaActualizada) {
        aulaRepositorio.save(aulaActualizada); // Save actúa como "insertar" o "actualizar"
    }

    @Override
    public void eliminarAula(Integer id) {
        aulaRepositorio.deleteById(id);
    }
}