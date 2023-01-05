package com.example.test.models;

import com.example.test.models.escenario.Escenario;

public class BoardModel {

    private PlayerModel player1;
    private PlayerModel player2;
    private Escenario escenario;
  //  private ArrayList<CharacterModel> charactersOnBoard;

    private BoardModel( PlayerModel player1, PlayerModel player2, Escenario escenario) {
        this.player1 = player1;
        this.player2 = player2;
        this.setEscenario(getEscenario());
    }

    public PlayerModel getPlayerModel1() {
        return player1;
    }

    public void setPlayerModel1(PlayerModel playerModel) { this.player1 = player1; }

    public PlayerModel getPlayerModel2() {
        return player2;
    }

    public void setPlayerModel2(UserModel playerModel) {
        this.player2 = player2;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }
}
