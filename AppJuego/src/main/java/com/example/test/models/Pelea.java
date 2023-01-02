package com.example.test.models;

public class Pelea {

    private BoardModel boardModel;

    public Pelea(BoardModel boardModel) {
        this.boardModel = boardModel;
    }

    public BoardModel getBoardModel() {
        return boardModel;
    }

    public void setBoardModel(BoardModel boardModel) {
        this.boardModel = boardModel;
    }

    public void simularPelea(PlayerModel player1, PlayerModel player2) {
        // Mientras ambos personajes tengan personajes con vida, seguir simulando la pelea
        while (player1.getNumberOfCharactersAlive() > 0 && player2.getNumberOfCharactersAlive() > 0) {

            // Simular el turno de cada jugador
            //simularTurno(player1, player2);
            //simularTurno(player2, player1);
            //Comentado fuera porque no esta implementado y no permite compilar
        }

        // Determinar quién ganó la pelea
        if (player1.getNumberOfCharactersAlive() > 0 && player2.getNumberOfCharactersAlive() == 0) {
            // p1 ganó
            System.out.println("El ganador es " + player1.getName());
        } else {
            // p2 ganó
            System.out.println("El ganador es " + player2.getName());
        }
    }


}

