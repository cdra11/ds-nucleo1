package com.itsqmet.nucleo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexControlador {
    @GetMapping("/inicio")
    public String paginaInicio(){
        return "index";
    }
}
