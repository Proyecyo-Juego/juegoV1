package com.example.test.models;

import com.example.test.controllers.SoundManager;
import com.example.test.UIController;

import java.util.Random;

public class PeleaBasica {//Pelea basica para el modo de juego 1vs1
    private CharacterModel Hero1;
    private int Enemy1HP;

    private Boolean PlayerTurn;

    private static PeleaBasica me = null;

    private PeleaBasica(){
        this.me = this;
    }

    public static PeleaBasica getInstance(){
        if(me == null){
            me = new PeleaBasica();
        }
        return me;
    }


    public void setCharacterModel(CharacterModel Hero1){
        this.Hero1 = Hero1;
    }
    public CharacterModel getCharacterModel(){
        return this.Hero1;
    }
    public void setEnemy1HP(int Enemy1HP){
        this.Enemy1HP = Enemy1HP;
    }
    public int getEnemy1HP(){
        return this.Enemy1HP;
    }

    public void initPeleaBasica(int Enemy1HP){

        this.Enemy1HP = Enemy1HP;
        this.Hero1.setHealth(100L);
        this.PlayerTurn = true;
    }

    public String attackEnemy1(){
        if (this.PlayerTurn == false){
            return "No es tu turno!";
        }
        String message = Hero1.getName();

        Random random = new Random();
        int randomDamage = random.nextInt(10)+20;
        message = getStringAttack(message, random);
        message += "Enemy 1 for " + randomDamage + " damage";
        Enemy1HP -= randomDamage;
        SoundManager.SonidoAtaque();
        PlayerTurn = false;
        return message;
    }


    public Void enemyTurn(){
        if (this.PlayerTurn){
            UIController.getInstance().getPeleaUI().setLogMSG("No es tu turno!");
            return null;
        }
        String message = "Enemy 1";
        Random random = new Random();
        int randomDamage = random.nextInt(10)+10;
        message = getStringAttack(message, random);
        message += Hero1.getName() + " for " + randomDamage + " damage";
        Hero1.setHealth(Hero1.getHealth()-randomDamage);
        SoundManager.SonidoAtaque();
        PlayerTurn = true;
        UIController.getInstance().getPeleaUI().updateHPbars();
        UIController.getInstance().getPeleaUI().setLogMSG(message);
        if(Hero1.getHealth()<0){
            UIController.getInstance().getPeleaUI().derrota();
        }
        return null;
    }
    public Void healHero(){
        if (this.PlayerTurn == false){
            UIController.getInstance().getPeleaUI().setLogMSG("No es tu turno!");
            return null;
        }
        String message = Hero1.getName();
        Random random = new Random();
        int randomHeal = random.nextInt(10)+10;
        message += "Healed for " + randomHeal + " health";
        Hero1.setHealth(Hero1.getHealth()+randomHeal);
        SoundManager.SonidoCurar();
        PlayerTurn = false;
        UIController.getInstance().getPeleaUI().updateHPbars();
        UIController.getInstance().getPeleaUI().setLogMSG(message);
        return null;
    }

    private String getStringAttack(String message, Random random) {
        int randomDamageWord = random.nextInt(3)+1;
        switch (randomDamageWord){
            case 1:
                message += " hits ";
                break;
            case 2:
                message += " attacks ";
                break;
            case 3:
                message += " strikes ";
                break;
        }
        return message;
    }

    public int getHeroHP() {
        return Hero1.getHealth().intValue();
    }
    public Boolean getPlayerTurn(){
        return this.PlayerTurn;
    }
}
