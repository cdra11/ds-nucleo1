package com.itsqmet.nucleo.servicio;

import com.itsqmet.nucleo.modelo.Aula;

import java.util.List;

public interface IAulaServicio {
    // Método para insertar un nuevo aula
    public void insertarAula(Aula nuevaAula);

    // Método para listar todas las aulas
    public List<Aula> listarAulas();

    // Método para obtener un aula por su ID
    public Aula obtenerAulaPorId(Integer id);

    // Método para actualizar los datos de un aula
    public void actualizarAula(Aula aulaActualizada);

    // Método para eliminar un aula por su ID
    public void eliminarAula(Integer id);
}
