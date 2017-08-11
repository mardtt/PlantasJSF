package com.model;

import java.io.Serializable;

public class Planta implements Serializable {
    
    private String nombre, nombreCientifico, tipo, familia, especie, genero, color, region, clase, division;
    private int codigo;

    public Planta() {
        
    }
    
    public Planta(String nombre, String nombreCientifico, String tipo, String familia, String especie, String genero, String color, String region, String clase, String division, int codigo) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.tipo = tipo;
        this.familia = familia;
        this.especie = especie;
        this.genero = genero;
        this.color = color;
        this.region = region;
        this.clase = clase;
        this.division = division;
        this.codigo = codigo;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre () {
        return nombre;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
