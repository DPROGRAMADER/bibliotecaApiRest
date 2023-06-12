package com.example.Biblioteca.Api.Rest.Servicios;

import com.example.Biblioteca.Api.Rest.Repositorios.CategoriaRepositorio;
import com.example.Biblioteca.Api.Rest.entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServicio {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    public ResponseEntity<Categoria>crearCategoria(Categoria categoria){
        Categoria resultado=categoriaRepositorio.save(categoria);
        return  ResponseEntity.ok(resultado);
    }
}
