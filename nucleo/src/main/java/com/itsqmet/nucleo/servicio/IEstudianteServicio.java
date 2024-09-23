package com.itsqmet.nucleo.servicio;

import com.itsqmet.nucleo.modelo.Estudiante;

import java.util.List;

public interface IEstudianteServicio {
    // Método para insertar un nuevo estudiante
    public void insertarEstudiante(Estudiante nuevoEstudiante);

    // Método para listar todos los estudiantes
    public List<Estudiante> listarEstudiantes();

    // Método para obtener un estudiante por su ID
    public Estudiante obtenerEstudiantePorId(Integer id);

    // Método para actualizar los datos de un estudiante
    public void actualizarEstudiante(Estudiante estudianteActualizado);

    // Método para eliminar un estudiante por su ID
    public void eliminarEstudiante(Integer id);
}
