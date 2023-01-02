package com.example.test.models;

import com.example.test.models.equipamiento.arma;

import java.util.ArrayList;

public class CharacterModel {

    private String name;
    private Long health;
    private Long damage;
    private CharacterModel characterModelObjetivo;
    private arma armaEquipada;
    private ArrayList<MovementModel> movementSet;
    private String status;

    public CharacterModel(String name, Long health, CharacterModel characterModelObjetivo) {
        this.name = name;
        this.health = health;
        this.characterModelObjetivo = characterModelObjetivo;
        this.setArmaEquipada(getArmaEquipada());
        this.setMovementSet(new ArrayList<>());
        this.status = "Full Health";
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CharacterModel getCharacterModelObjetivo() {
        return characterModelObjetivo;
    }

    public void setCharacterModelObjetivo(CharacterModel characterModelObjetivo) {
        this.characterModelObjetivo = characterModelObjetivo;
    }

    public arma getArmaEquipada() {
        return armaEquipada;
    }

    public void setArmaEquipada(arma armaEquipada) {
        this.armaEquipada = armaEquipada;
    }

    public ArrayList<MovementModel> getMovementSet() {
        return movementSet;
    }

    public void setMovementSet(ArrayList<MovementModel> movementSet) {
        this.movementSet = movementSet;
    }

}
