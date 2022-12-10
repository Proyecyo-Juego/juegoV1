package com.example.test.ranking;

public class Equipo {

    private String nombre;
    private int victorias;

    public Equipo() {
    }

    public Equipo(String nombre, int victorias) {
        this.nombre = nombre;
        this.victorias = victorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", victorias=" + victorias +
                '}';
    }
}


