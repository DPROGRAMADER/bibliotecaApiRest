package com.example.Biblioteca.Api.Rest.Controladores;

import com.example.Biblioteca.Api.Rest.Servicios.UbicacionServicio;
import com.example.Biblioteca.Api.Rest.entidades.Ubicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ubicacion")
public class UbicacionControlador {

    @Autowired
    private UbicacionServicio ubicacionServicio;
    @PostMapping
    public ResponseEntity<Ubicacion> crearUbicacion(@RequestBody Ubicacion ubicacion){
        return ubicacionServicio.crearUbicacion(ubicacion);

    }
}
