package com.example.Biblioteca.Api.Rest.Repositorios;

import com.example.Biblioteca.Api.Rest.entidades.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbicacionRepositorio extends JpaRepository<Ubicacion,Integer> {
}
