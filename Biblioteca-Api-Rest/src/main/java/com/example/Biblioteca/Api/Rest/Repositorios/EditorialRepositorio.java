package com.example.Biblioteca.Api.Rest.Repositorios;

import com.example.Biblioteca.Api.Rest.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial,Integer> {
}
