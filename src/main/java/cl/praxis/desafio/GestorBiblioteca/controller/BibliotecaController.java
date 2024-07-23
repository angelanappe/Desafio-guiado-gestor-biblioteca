package cl.praxis.desafio.GestorBiblioteca.controller;

import cl.praxis.desafio.GestorBiblioteca.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accion")
public class BibliotecaController {

    private final BibliotecaService bibliotecaService;

    @Autowired  //inyecta dependencias por constuctor
    public BibliotecaController (BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }

    @GetMapping()
    public String accion(@RequestParam String accion){
        bibliotecaService.accionUsuario(accion);
        return "Acción realizada: " + accion;
    }
}
