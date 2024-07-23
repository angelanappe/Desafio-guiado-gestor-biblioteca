package cl.praxis.desafio.GestorBiblioteca.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BibliotecaService {

    private static final Logger logger = LoggerFactory.getLogger(BibliotecaService.class);

    //envía parametro accion por la url y se imprime en consola -> accion?accion=camina
    public void accionUsuario (String accion) {
        logger.info("Qué realiza el usuario? {}", accion);
    }
}
