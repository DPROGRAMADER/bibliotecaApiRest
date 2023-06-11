package com.example.Biblioteca.Api.Rest.Controladores;

import com.example.Biblioteca.Api.Rest.Servicios.AutorServicio;
import com.example.Biblioteca.Api.Rest.entidades.Autor;
import com.example.Biblioteca.Api.Rest.entidades.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autor")
public class AutorControlador {

    @Autowired
    private AutorServicio autorServicio;

    @PostMapping
    public ResponseEntity<Autor> crearAutor(@RequestBody Autor autor){
        return autorServicio.crearAutor(autor);
    }
}
