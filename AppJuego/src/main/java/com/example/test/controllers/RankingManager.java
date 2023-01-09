package com.example.test.controllers;

import com.example.test.models.ranking.RankingList;
import com.example.test.models.ranking.RankingScore;

import java.io.FileInputStream;
import java.util.ArrayList;

public class RankingManager {

    private RankingList rankingList;
    private static RankingManager me = null;

    private RankingManager() {
        me = this;
        try {
            rankingList = loadScores();
        } catch (Exception e) {
            rankingList = new RankingList(new ArrayList<>());
        }

    }


    public static RankingManager getInstance() {
        if (me == null) {
            me = new RankingManager();
        }
        return me;
    }

    public void addScore(String name,String hero, int score) {
        rankingList.addScore(new RankingScore(name,hero ,score));
        rankingList.Sort();
        saveScores();
    }

    private RankingList loadScores() {
        RankingList temp = null;
        try {
            FileInputStream fileIn = new FileInputStream("AppJuego/Datos/Ranking/datosRanking.ser");
            java.io.ObjectInputStream in = new java.io.ObjectInputStream(fileIn);
            temp = (RankingList) in.readObject();
            in.close();
            fileIn.close();
        } catch (Exception e) {
            temp = new RankingList(new ArrayList<>());

            }
        return temp;
        }

    public void saveScores() {
        try {
            java.io.FileOutputStream fileOut = new java.io.FileOutputStream("AppJuego/Datos/Ranking/datosRanking.ser");
            java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(fileOut);
            out.writeObject(rankingList);
            out.close();
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public RankingList getRankingList() {
        return rankingList;
    }

    public void print() {
        rankingList.print();
    }
}

