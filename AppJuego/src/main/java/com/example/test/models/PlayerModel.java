package com.example.test.models;

import com.example.test.models.escenario.Escenario;

import java.util.ArrayList;

public class PlayerModel { //Singeton pattern

    private static PlayerModel me = null;

    private String name;
    private Integer numberOfCharactersAlive;
    private ArrayList<CharacterModel> team;

    private Escenario escenario;

    private PlayerModel(String name, ArrayList<CharacterModel> team) {
        this.name = name;
        this.numberOfCharactersAlive = team.size();
        this.team = team;
    }


    public static PlayerModel getInstance(){
        if(me == null){
            me = new PlayerModel("Player", new ArrayList<>());
        }
        return me;
    }
    public static PlayerModel getInstance(String name){
        if(me == null){
            me = new PlayerModel(name, new ArrayList<>());
        }
        return me;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }
    public Escenario getEscenario() {
        return escenario;
    }


    public void elegirPersonaje(CharacterModel characterModel){
        team.removeAll(team);
        team.add(characterModel);
    }
    public CharacterModel getCharacterModel(){
        return team.get(0);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CharacterModel> getDeck() {
        return team;
    }

    public void setDeck(ArrayList<CharacterModel> deck) {
        this.team = team;
    }

    public Integer getNumberOfCharactersAlive() {
        return numberOfCharactersAlive;
    }

    public void setNumberOfCharactersAlive(Integer numberOfCharactersAlive) {
        this.numberOfCharactersAlive = numberOfCharactersAlive;
    }
}
