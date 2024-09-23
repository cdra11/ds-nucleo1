package com.itsqmet.nucleo.servicio;

import com.itsqmet.nucleo.modelo.Curso;

import java.util.List;

public interface ICursoServicio {
    // Método para insertar un nuevo curso
    public void insertarCurso(Curso nuevoCurso);

    // Método para listar todos los cursos
    public List<Curso> listarCursos();

    // Método para obtener un curso por su ID
    public Curso obtenerCursoPorId(Integer id);

    // Método para actualizar los datos de un curso
    public void actualizarCurso(Curso cursoActualizado);

    // Método para eliminar un curso por su ID
    public void eliminarCurso(Integer id);
}
