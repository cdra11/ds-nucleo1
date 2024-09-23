package com.itsqmet.nucleo.controlador;

import com.itsqmet.nucleo.modelo.Aula;
import com.itsqmet.nucleo.servicio.IAulaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/aula")
public class AulaControlador {

    @Autowired
    private IAulaServicio aulaServicio;

    @GetMapping("/listarAula")
    public String listarAulas(Model model) {
        List<Aula> aulas = aulaServicio.listarAulas();
        model.addAttribute("aulas", aulas);
        return "aula/listarAula";  // Ruta de la plantilla
    }

    @GetMapping("/crearAula")
    public String crearAula(Model model) {
        model.addAttribute("aula", new Aula());
        return "aula/crearAula";  // Ruta de la plantilla
    }

    @PostMapping("/guardarAula")
    public String guardarAula(@ModelAttribute Aula aula) {
        aulaServicio.insertarAula(aula);
        return "redirect:/aula/listarAula";
    }

    @GetMapping("/editarAula/{id}")
    public String editarAula(@PathVariable("id") Integer id, Model model) {
        Aula aula = aulaServicio.obtenerAulaPorId(id);
        model.addAttribute("aula", aula);
        return "aula/editarAula";  // Ruta de la plantilla
    }

    @PostMapping("/actualizarAula")
    public String actualizarAula(@ModelAttribute Aula aula) {
        aulaServicio.actualizarAula(aula);
        return "redirect:/aula/listarAula";
    }

    @GetMapping("/eliminarAula/{id}")
    public String eliminarAula(@PathVariable("id") Integer id) {
        aulaServicio.eliminarAula(id);
        return "redirect:/aula/listarAula";
    }
}
