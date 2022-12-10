package com.example.test.ranking;


public class Equipo {

    private String Nombre;
    private int victorias;


    public Equipo() {
    }

    public Equipo(String Nombre, int victorias) {
        this.Nombre = Nombre;
        this.victorias = victorias;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre= Nombre;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
}
