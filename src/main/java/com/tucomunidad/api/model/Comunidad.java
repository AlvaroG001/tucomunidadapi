package com.tucomunidad.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comunidades") // Especifica el nombre de la tabla para evitar discrepancias
public class Comunidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean cinema;

    @Column(nullable = false)
    private boolean gym;

    @Column(nullable = false)
    private boolean library;

    @Column(nullable = false)
    private boolean padel;

    @Column(nullable = false)
    private boolean pool;

    // Constructor vacío necesario para JPA
    public Comunidad() {
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCinema() {
        return cinema;
    }

    public void setCinema(boolean cinema) {
        this.cinema = cinema;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public boolean isLibrary() {
        return library;
    }

    public void setLibrary(boolean library) {
        this.library = library;
    }

    public boolean isPadel() {
        return padel;
    }

    public void setPadel(boolean padel) {
        this.padel = padel;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }
}
