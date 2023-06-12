package com.example.Biblioteca.Api.Rest.Servicios;

import com.example.Biblioteca.Api.Rest.Repositorios.UbicacionRepositorio;
import com.example.Biblioteca.Api.Rest.entidades.Ubicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UbicacionServicio {

    @Autowired
    private UbicacionRepositorio ubicacionRepositorio;

    public ResponseEntity<Ubicacion>crearUbicacion(Ubicacion ubicacion){
        Ubicacion resultado=ubicacionRepositorio.save(ubicacion);
        return ResponseEntity.ok(resultado);
    }
}
