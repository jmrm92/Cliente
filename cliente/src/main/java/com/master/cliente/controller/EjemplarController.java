package com.master.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.cliente.model.Ejemplar;
import com.master.cliente.service.EjemplarService;

@RestController
public class EjemplarController {
    

    @Autowired
    EjemplarService service;

    @PostMapping(value = "/ejemplar/{isbn}/{titulo}/{autor}/{tematica}")
    public List <Ejemplar> altaEjemplar (@PathVariable String isbn, @PathVariable String titulo,@PathVariable String autor, @PathVariable String tematica) {
        Ejemplar ejemplar = new Ejemplar(isbn, titulo, autor, tematica);
        return service.nuevoEjemplar(ejemplar);
    }
}
