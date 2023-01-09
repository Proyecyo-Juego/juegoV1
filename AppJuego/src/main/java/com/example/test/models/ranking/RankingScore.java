package com.example.test.models.ranking;

import java.io.Serializable;

public class RankingScore implements Serializable {
    private String name;
    private String Character;
    private int score;

    public RankingScore(String name,String Character , int score) {
        this.name = name;
        this.Character = Character;
        this.score = score;
    }

    public String getPlayerName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return Character;
    }
    public void setCharacter(String Character) {
        this.Character = Character;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
