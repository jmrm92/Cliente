package com.master.cliente.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.master.cliente.model.Ejemplar;

@RestController
public class EjemplarServiceImpl implements EjemplarService {

    @Autowired
    RestTemplate template;

    private String url = "http://localhost:8080/";

    @Override
    public List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar) {
        template.postForLocation(url+"libro", ejemplar);
        return Arrays.asList(template.getForObject(url+"libro", Ejemplar[].class));
    }
    

}
