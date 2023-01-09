package com.example.test.controllers;

import com.example.test.models.ui.*;

import javax.swing.*;
import java.awt.*;

public class UIController {

    private static UIController me = null;
    private JFrame mainFrame;
    private JPanel cards;


    private LoginUI loginUI;
    private RegisterUI registerUI;
    private UIHome uiHome;
    private ElegirEscenario elegirEscenario;
    private ElegirPersonaje elegirPersonaje;
    private PeleaUI peleaUI;
    private RankingUI rankingUI;


    private UIController(){


        mainFrame = new JFrame("Main");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1280, 720);
        cards = new JPanel(new CardLayout());
        cards.setSize(1280, 720);
        initializeCards();
        this.me= this;
    }

    public static UIController getInstance(){
        if(me == null){
            me = new UIController();
        }
        return me;
    }


    public static void main(String[] args) {
        //SwingUtilities.invokeLater(LoginUI::new);
        System.out.println("UIController.main");

        UIController uiController = new UIController();
    }


    private void initializeCards(){

        loginUI = new LoginUI(cards);
        JPanel loginPanel = loginUI.getPanel();

        registerUI = new RegisterUI(cards);
        JPanel registerPanel = registerUI.getPanel();

        uiHome = new UIHome(cards);
        JPanel homePanel = uiHome.getPanel();

        elegirEscenario = new ElegirEscenario(cards);
        JPanel elegirEscenarioPanel = elegirEscenario.getPanel();

        elegirPersonaje = new ElegirPersonaje(cards);
        JPanel elegirPersonajePanel = elegirPersonaje.getPanel();

        peleaUI = new PeleaUI(cards);
        JPanel peleaPanel = peleaUI.getPanel();

        rankingUI = new RankingUI();
        JPanel rankingPanel = rankingUI.getPanel();




        cards.add(loginPanel, "Login");
        cards.add(registerPanel, "Register");
        cards.add(homePanel, "Home");
        cards.add(elegirEscenarioPanel, "ElegirEscenario");
        cards.add(elegirPersonajePanel, "ElegirPersonaje");
        cards.add(peleaPanel, "Pelea");
        cards.add(rankingPanel, "Ranking");

        mainFrame.add(cards);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    public PeleaUI getPeleaUI() {
        return peleaUI;
    }

}
