package com.example.Biblioteca.Api.Rest.Servicios;

import com.example.Biblioteca.Api.Rest.Repositorios.AutorRepositorio;
import com.example.Biblioteca.Api.Rest.entidades.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AutorServicio {
    @Autowired
    private AutorRepositorio autorRepositorio;

    public ResponseEntity<Autor>crearAutor(Autor autor){
        Autor resultado=autorRepositorio.save(autor);
        return ResponseEntity.ok(resultado);
    }
}
