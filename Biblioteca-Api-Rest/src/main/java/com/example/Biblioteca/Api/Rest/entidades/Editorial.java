package com.example.Biblioteca.Api.Rest.entidades;

import jakarta.persistence.*;
import org.springframework.data.repository.cdi.Eager;

@Entity
@Table(name="editoriales")
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombres",nullable = false,length = 30)
    private String nombre;

    @Column(name = "descripciones",nullable = false,length = 300)
    private String descripcion;


    public Editorial() {
    }

    public Editorial(Integer id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
