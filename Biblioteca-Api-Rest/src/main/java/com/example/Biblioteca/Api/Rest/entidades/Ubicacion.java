package com.example.Biblioteca.Api.Rest.entidades;

import jakarta.persistence.*;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

@Entity
@Table(name = "ubicaciones")
public class Ubicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "pisos",nullable = false)
    private String piso;
    @Column(name = "salones",nullable = false)
    private String salon;
    @Column(name = "estanterias",nullable = false)
    private String estante;

    public Ubicacion() {
    }

    public Ubicacion(Integer id, String piso, String salon, String estante) {
        this.id = id;
        this.piso = piso;
        this.salon = salon;
        this.estante = estante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }
}
