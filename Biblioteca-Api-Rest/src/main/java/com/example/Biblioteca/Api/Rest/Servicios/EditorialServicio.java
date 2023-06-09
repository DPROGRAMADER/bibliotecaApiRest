package com.example.Biblioteca.Api.Rest.Servicios;

import com.example.Biblioteca.Api.Rest.Repositorios.EditorialRepositorio;
import com.example.Biblioteca.Api.Rest.entidades.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EditorialServicio {

    @Autowired
    private EditorialRepositorio editorialRepositorio;

    public ResponseEntity<Editorial>crearEditorial(Editorial editorial){
       Editorial resultado=editorialRepositorio.save(editorial);
       return ResponseEntity.ok(resultado);
    }
}
