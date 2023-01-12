package com.example.test.controllers;

import com.example.test.models.ranking.RankingList;
import com.example.test.models.ranking.RankingScore;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
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
            InputStream file = RankingManager.class.getResourceAsStream("/Datos/Ranking/datosRanking.ser");
            java.io.ObjectInputStream in = new java.io.ObjectInputStream(file);
            temp = (RankingList) in.readObject();
            in.close();
            file.close();
        } catch (Exception e) {
            temp = new RankingList(new ArrayList<>());

            }
        return temp;
        }

    public void saveScores() {
        try {
            URL url = RankingManager.class.getResource("/Datos/Ranking/datosRanking.ser");
            java.io.FileOutputStream fileOut = new java.io.FileOutputStream(new File(url.toURI()));
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

