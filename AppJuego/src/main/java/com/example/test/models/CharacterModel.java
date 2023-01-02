package com.example.test.models;

import com.example.test.models.equipamiento.arma;
import com.example.test.models.equipamiento.augmentacion;

import java.util.ArrayList;

public class CharacterModel {

    private String name;
    private Long health;
    private Long damage;
    private CharacterModel characterModelObjetivo;
    private arma armaEquipada;
    private ArrayList<augmentacion> augmentacionesEquipadas;

    private ArrayList<MovementModel> movementSet;

    public CharacterModel(String name, Long health, CharacterModel characterModelObjetivo) {
        this.name = name;
        this.health = health;
        this.characterModelObjetivo = characterModelObjetivo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHealth() {
        return health;
    }

    public void setHealth(Long health) {
        this.health = health;
    }

    public Long getDamage() {
        return damage;
    }

    public void setDamage(Long damage) {
        this.damage = damage;
    }

    public CharacterModel getCharacterModelObjetivo() {
        return characterModelObjetivo;
    }

    public void setCharacterModelObjetivo(CharacterModel characterModelObjetivo) {
        this.characterModelObjetivo = characterModelObjetivo;
    }

    public void combat(CharacterModel c){
        long resta = this.health - c.damage;
        System.out.println(
                String.format(("El personaje %s ha hecho %d al personaje %s"), this.name,resta,c.name));
    }

    public String victory(CharacterModel c){
        if(this.health > c.health){
            return String.format("El ganador es %s",this.name);
        }
        return String.format("El ganador es %s",c.name);
    }


}
