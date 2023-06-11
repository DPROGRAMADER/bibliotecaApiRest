package com.example.Biblioteca.Api.Rest.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="Autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres",nullable = false)
    private String nombre;

    @Column(name = "apellidos",nullable = false)
    private String apellido;

    @Column(name = "pseudonimos",nullable = false)
    private String pseudonimo;

    private String nacionalidad;

    private String email;

    public Autor() {
    }

    public Autor(Integer id, String nombre, String apellido, String pseudonimo, String nacionalidad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pseudonimo = pseudonimo;
        this.nacionalidad = nacionalidad;
        this.email = email;
    }

    public Integer getId() { return id;}

    public void setId(Integer id) { this.id = id;}

    public String getNombre() { return nombre;}

    public void setNombre(String nombre) { this.nombre = nombre;}

    public String getApellido() { return apellido;}

    public void setApellido(String apellido) { this.apellido = apellido;}

    public String getPseudonimo() { return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) { this.pseudonimo = pseudonimo;}

    public String getNacionalidad() { return nacionalidad;}

    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad;}

    public String getEmail() { return email;}

    public void setEmail(String email) { this.email = email;}

}




