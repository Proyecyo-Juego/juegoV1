package com.example.test.models;

public class CardModel {
    String nombre;
    String descripcion;
    int valor;

    int Damage=0;

    public CardModel(String nombre, String descripcion, int valor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public CardModel(String nombre, String descripcion, int valor, int Damage) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.Damage = Damage;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getValor() {
        return valor;
    }
    public int getDamage() {
        return Damage;
    }
    public void setDamage(int damage) {
        Damage = damage;
    }

}
