package com.itsqmet.nucleo.controlador;

import com.itsqmet.nucleo.modelo.Estudiante;
import com.itsqmet.nucleo.servicio.IEstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteControlador {

    @Autowired
    private IEstudianteServicio estudianteServicio;

    // Mostrar la lista de estudiantes
    @GetMapping
    public String listarEstudiantes(Model model) {
        List<Estudiante> estudiantes = estudianteServicio.listarEstudiantes();
        model.addAttribute("estudiantes", estudiantes);
        return "estudiante/listarEstudiante"; // Ruta de la vista de lista
    }

    // Mostrar el formulario para crear un nuevo estudiante
    @GetMapping("/nuevo")
    public String mostrarFormularioCrearEstudiante(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "estudiante/formularioEstudiante"; // Ruta de la vista del formulario
    }

    // Procesar la creación de un nuevo estudiante
    @PostMapping("/guardar")
    public String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
        estudianteServicio.insertarEstudiante(estudiante);
        return "redirect:/estudiantes"; // Redirigir a la lista después de guardar
    }

    // Mostrar el formulario para editar un estudiante
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarEstudiante(@PathVariable("id") Integer id, Model model) {
        Estudiante estudiante = estudianteServicio.obtenerEstudiantePorId(id);
        model.addAttribute("estudiante", estudiante);
        return "estudiante/formularioEstudiante"; // Ruta de la vista del formulario
    }

    // Procesar la actualización de un estudiante
    @PostMapping("/actualizar")
    public String actualizarEstudiante(@ModelAttribute Estudiante estudiante) {
        estudianteServicio.actualizarEstudiante(estudiante);
        return "redirect:/estudiantes"; // Redirigir a la lista después de actualizar
    }

    // Procesar la eliminación de un estudiante
    @GetMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable("id") Integer id) {
        estudianteServicio.eliminarEstudiante(id);
        return "redirect:/estudiantes"; // Redirigir a la lista después de eliminar
    }
}
