package com.example.Biblioteca.Api.Rest.Controladores;

import com.example.Biblioteca.Api.Rest.Servicios.CategoriaServicio;
import com.example.Biblioteca.Api.Rest.entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaControlador {
    @Autowired
    private CategoriaServicio categoriaServicio;

    public ResponseEntity<Categoria> crearCategoria(@RequestBody Categoria categoria){
        return categoriaServicio.crearCategoria(categoria);
    }
}
