package com.example.Biblioteca.Api.Rest.Repositorios;

import com.example.Biblioteca.Api.Rest.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor,Integer> {
}
