package com.example.test.models;

import java.util.concurrent.Semaphore;

public class GameModel {

    private int turnNumber;
    private Semaphore semaphore;
    private BoardModel boardModel;

    public GameModel(BoardModel boardModel) {
        this.boardModel = boardModel;
        this.turnNumber = 0;
        this.semaphore = new Semaphore(1);
    }

    public BoardModel getBoardModel() {
        return boardModel;
    }

    public void setBoardModel(BoardModel boardModel) {
        this.boardModel = boardModel;
    }
    
    //en construccion

/*
    public int jugadorObjetivo(int turnNumber) {
        int jugadorObjetivo = 0;
        if (turnNumber % 2 == 0) {
            jugadorObjetivo = 1;
        } else {
            jugadorObjetivo = 0;
        }
        return jugadorObjetivo;
    }

    // Method to start the game loop
    public void run() throws InterruptedException {
        boolean gameOver = false;
        while (!gameOver) {
            PlayerModel currentPlayer;

            // Acquire the semaphore to take control of the game
            semaphore.acquire();

            // Get the current player
            if (jugadorObjetivo(turnNumber) == 0) {
                currentPlayer = boardModel.getPlayerModel1();
            } else {
                currentPlayer = boardModel.getPlayerModel2();
            }

            // Prompt the current player to take their turn
            System.out.println(currentPlayer.getName() + ", es tu turno!");

            // Handle the current player's actions
            handleTurn(currentPlayer);

            // Increment the turn number
            turnNumber++;

            // Release the semaphore to allow the next player to take their turn
            semaphore.release();
            if ((currentPlayer.getNumberOfCharactersAlive() <= 0) && currentPlayer.getTeam().isEmpty()) {
                gameOver = true;
                System.out.println("El jugador " + currentPlayer.getName() + " ha perdido");
            }
        }
    }

    // Method to handle a player's turn
    public void handleTurn(PlayerModel player) {
        System.out.println("¿Qué quieres hacer: (1) Jugar un personaje (2) Accion con el personaje");

        // Read the player's input and handle the appropriate action
        int action = readInput();
        if (action == 1) {
            System.out.println("Elije qué personaje jugar: ");
            for (int i = 0; i < player.getTeam().size(); i++) {
                System.out.println("(" + (i) + ") " + player.getTeam().get(i).getName());
            }
            int characterIndex = readInput();
            CharacterModel character = player.getTeam().get(characterIndex);
            player.playCharacter(character);
        } else if (action == 2) {
            System.out.println("Elije qué personaje usar: ");
            for (int i = 0; i < player.getCharacters().size(); i++) {
                System.out.println("(" + (i) + ") " + player.getCharacters().get(i).getName());
            }
            int characterIndex = readInput();
            CharacterModel character = player.getCharacters().get(characterIndex);
            System.out.println("¿Qué quieres hacer: (1) Atacar (2) Usar habilidad");
            int action2 = readInput();
            if (action2 == 1) {
                System.out.println("Elije qué personaje atacar: ");
                for (int i = 0; i < boardModel.getCharacters().size(); i++) {
                    System.out.println("(" + (i) + ") " + boardModel.getCharacters().get(i).getName());
                }
                int characterIndex2 = readInput();
                CharacterModel character2 = boardModel.getCharacters().get(characterIndex2);
                character.attack(character2);
            } else if (action2 == 2) {
                character.useAbility();
            }

        }
    }

        public int readInput() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
*/
}

