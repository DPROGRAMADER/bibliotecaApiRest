package com.example.Biblioteca.Api.Rest.Repositorios;

import com.example.Biblioteca.Api.Rest.entidades.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepositorio extends JpaRepository<Pais,Integer> {
}
