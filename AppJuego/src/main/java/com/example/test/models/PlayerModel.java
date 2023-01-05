package com.example.test.models;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class PlayerModel {

    private String name;
    private Integer numberOfCharactersAlive;
    private ArrayList<CharacterModel> team;
    private ArrayList<CharacterModel> characterOnBoard;
    private Semaphore semaphore;


    public PlayerModel(String name, Integer numberOfCharactersAlive, ArrayList<CharacterModel> team, ArrayList<CharacterModel> characterOnBoard) {
        this.setName(name);
        this.setNumberOfCharactersAlive(numberOfCharactersAlive);
        this.setTeam(team);
        this.setCharacterOnBoard(characterOnBoard);
        this.semaphore = new Semaphore(1);
    }

    public PlayerModel(UserModel userModel) {
        this.setName(userModel.getNombre());
        this.numberOfCharactersAlive = team.size();
        this.setTeam(new ArrayList<>());
        this.setCharacterOnBoard(new ArrayList<>());
        this.semaphore = new Semaphore(1);
    }

    public PlayerModel() {
        this.setName("Maquina");
        this.numberOfCharactersAlive = team.size();
        this.setTeam(new ArrayList<>());
        this.setCharacterOnBoard(new ArrayList<>());
        this.semaphore = new Semaphore(1);
    }

    // Method to play a character from the player's team
    public void playCharacter(CharacterModel character) {
        // Check if the player has the specified character in their team
        if (this.getTeam().contains(character)) {
            System.out.println("¡No tienes a ese personaje en el equipo!");
        } else {
            // Remove the character from the player's team and play it
            characterOnBoard.add(character);
            this.getTeam().remove(character);
            System.out.println("Ha jugado al personaje: " + character.getName());
        }
    }

    // Method to attack with a character
    public void actionCharacter(CharacterModel character, CharacterModel target) {
        // Check if the player has the specified character on board and the target is on board
        if (this.getCharacterOnBoard().contains(character) || this.getCharacterOnBoard().contains(target)) {
            System.out.println("¡No se encuentra ese personaje en el tablero!");
        } else {
            //hay que poner las variedades de movimientos de cada personaje

            target.setHealth(target.getHealth() - character.getDamage());
            System.out.println("Ha atacado al personaje: " + target.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfCharactersAlive() {
        return numberOfCharactersAlive;
    }

    public void setNumberOfCharactersAlive(Integer numberOfCharactersAlive) {
        this.numberOfCharactersAlive = numberOfCharactersAlive;
    }

    public ArrayList<CharacterModel> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<CharacterModel> team) {
        this.team = team;
    }

    public ArrayList<CharacterModel> getCharacterOnBoard() {
        return characterOnBoard;
    }

    public void setCharacterOnBoard(ArrayList<CharacterModel> characterOnBoard) {
        this.characterOnBoard = characterOnBoard;
    }
}