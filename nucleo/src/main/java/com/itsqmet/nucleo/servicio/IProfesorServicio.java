package com.itsqmet.nucleo.servicio;

import com.itsqmet.nucleo.modelo.Profesor;

import java.util.List;

public interface IProfesorServicio {
    public void  insertarProfesor(Profesor nuevo);
    // Método para listar todos los profesores
    public List<Profesor> listarProfesores();

    // Método para obtener un profesor por su ID
    public Profesor obtenerProfesorPorId(Integer id);

    // Método para actualizar los datos de un profesor
    public void actualizarProfesor(Profesor profesorActualizado);

    // Método para eliminar un profesor por su ID
    public void eliminarProfesor(Integer id);

}
