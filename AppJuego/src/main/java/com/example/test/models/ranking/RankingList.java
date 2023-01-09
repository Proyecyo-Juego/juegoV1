package com.example.test.models.ranking;

import java.io.Serializable;
import java.util.List;

public class RankingList implements Serializable {
    private List<RankingScore> rankingScores;

    public RankingList(List<RankingScore> rankingScores) {
        this.rankingScores = rankingScores;
    }

    public List<RankingScore> getRankingScores() {
        return rankingScores;
    }

    public void addScore(RankingScore rankingScore) {
        rankingScores.add(rankingScore);
    }

    public void removeScore(RankingScore rankingScore) {
        rankingScores.remove(rankingScore);
    }
    public void Sort() {
        rankingScores.sort((o1, o2) -> o2.getScore() - o1.getScore());
    }
    public void print() {
        for (RankingScore rankingScore : rankingScores) {
            System.out.println("Playername: " + rankingScore.getPlayerName() + " Character: " + rankingScore.getCharacterName() + " Score: " + rankingScore.getScore());
        }
    }
    public int size() {
        return rankingScores.size();
    }
    public RankingScore get(int i) {
        return rankingScores.get(i);
    }

}
