package com.example.Biblioteca.Api.Rest.Controladores;

import com.example.Biblioteca.Api.Rest.Servicios.EditorialServicio;
import com.example.Biblioteca.Api.Rest.entidades.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/editorial")
public class EditorialControlador {
    @Autowired
    private EditorialServicio editorialServicio;
    @PostMapping
    public ResponseEntity<Editorial> crearEditorial(@RequestBody Editorial editorial){
        return editorialServicio.crearEditorial(editorial);
    }
}
