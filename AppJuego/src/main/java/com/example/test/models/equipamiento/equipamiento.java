package com.example.test.models.equipamiento;

import com.example.test.models.MovementModel;

public abstract class equipamiento {
    int valor;
    String nombre;
    String descripcion;
    MovementModel habilidad; //Habilidad que puede tener el equipamiento (disparar arma, usar augmentacion, etc)
    

    public equipamiento(int valor, String nombre, String descripcion, MovementModel habilidad) {
        this.valor = valor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.habilidad = habilidad;
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
    public MovementModel getHabilidad() {
        return habilidad;
    }
}
