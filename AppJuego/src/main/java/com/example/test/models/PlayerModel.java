package com.example.test.models;

import java.util.ArrayList;

public class PlayerModel {

    private String name;
    private Integer numberOfCharactersAlive;
    private ArrayList<CharacterModel> team;

    public PlayerModel(String name, ArrayList<CharacterModel> team) {
        this.name = name;
        this.numberOfCharactersAlive = team.size();
        this.team = team;
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
