package com.example.test.models.equipamiento;

public abstract class equipamiento {
    int valor;
    String nombre;
    String descripcion;
    

    public equipamiento(int valor, String nombre, String descripcion) {
        this.valor = valor;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
