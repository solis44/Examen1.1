package com.examen.controller;

import com.examen.entity.Evento;
import com.examen.service.IEventoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class EventoController {

    @Autowired
    private IEventoService eventoService;

    @GetMapping("/verEventos")
    public String evento(Model model) {
        List<Evento> listaEventos = eventoService.getEvento();
        model.addAttribute("titulo", "evento");
        model.addAttribute("evento", listaEventos);
        return "evento";
    }

    @PostMapping("/guardarEvento")
    public String evento(@ModelAttribute Evento evento) {
        eventoService.saveEvento(evento);
        return "evento";
    }

    @GetMapping("/modificarEvento/{idEvento}")
    public String modificarEvento(Evento evento, Model model) {
        evento = eventoService.find(evento);
        model.addAttribute("evento", evento);
        return "modificarEvento";
    }

    @GetMapping("/eliminarEvento/{idEvento}")
    public String eliminarEvento(@PathVariable("id") Long idEvento) {
        eventoService.deleteEvento(idEvento);
        return "redirect:/evento";
    }

    @GetMapping("/agregarEventosN")
    public String modificarEventos(Model model) {
        model.addAttribute("evento", new Evento());
        return "modificarEvento";
    }
    
    
 

}
