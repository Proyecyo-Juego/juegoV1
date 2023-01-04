package com.example.test.controllers;

import com.example.test.models.ui.*;

import javax.swing.*;
import java.awt.*;

public class UIController {

    private static UIController me = null;
    JFrame mainFrame;
    JPanel cards;


    LoginUI loginUI;
    UIHome uiHome;
    ElegirEscenario elegirEscenario;
    ElegirPersonaje elegirPersonaje;
    public PeleaUI peleaUI;


    private UIController(){


        mainFrame = new JFrame("Main");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1024, 512);
        cards = new JPanel(new CardLayout());
        cards.setSize(1024, 512);
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

        uiHome = new UIHome(cards);
        JPanel homePanel = uiHome.getPanel();

        elegirEscenario = new ElegirEscenario(cards);
        JPanel elegirEscenarioPanel = elegirEscenario.getPanel();

        elegirPersonaje = new ElegirPersonaje(cards);
        JPanel elegirPersonajePanel = elegirPersonaje.getPanel();

        peleaUI = new PeleaUI(cards);
        JPanel peleaPanel = peleaUI.getPanel();




        cards.add(loginPanel, "Login");
        cards.add(homePanel, "Home");
        cards.add(elegirEscenarioPanel, "ElegirEscenario");
        cards.add(elegirPersonajePanel, "ElegirPersonaje");
        cards.add(peleaPanel, "Pelea");

        mainFrame.add(cards);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

/*
    public void changeScreen(String screenName){
        System.out.println("UIController.changeScreen: " + screenName);
        ((CardLayout)cards.getLayout()).show(cards, screenName);
    }
 */
    public PeleaUI getPeleaUI() {
        return peleaUI;
    }

}