package com.example.test.models;

public class MovementModel {

    private String movementName;
    private String typeMovement;
    private int damageDealt;
    private int damageCover;

    public MovementModel(String movementName, String typeMovement, int damageDealt, int damageCover) {
        this.movementName = movementName;
        this.typeMovement = typeMovement;
        this.damageDealt = damageDealt;
        this.damageCover = damageCover;
    }

    public String getMovementName() {
        return movementName;
    }

    public void setMovementName(String movementName) {
        this.movementName = movementName;
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public void setDamageDealt(int damageDealt) {
        this.damageDealt = damageDealt;
    }

    public int getDamageCover() {
        return damageCover;
    }

    public void setDamageCover(int damageCover) {
        this.damageCover = damageCover;
    }
}
