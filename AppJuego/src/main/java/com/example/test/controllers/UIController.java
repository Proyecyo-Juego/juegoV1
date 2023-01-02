package com.example.test.controllers;

import com.example.test.models.ui.*;

import javax.swing.*;
import java.awt.*;

public class UIController {

    private static UIController me = null;
    JFrame mainFrame;
    JPanel cards;

    private UIController(){


        mainFrame = new JFrame("Main");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1024, 512);
        cards = new JPanel(new CardLayout());
        cards.setSize(1024, 512);
        initializeCards();
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
        //uiController.showLoginUI();
        uiController.show();
    }

    public void show(){
        cards.setVisible(true);
    }

    private void initializeCards(){

        LoginUI loginUI = new LoginUI(cards);
        JPanel loginPanel = loginUI.getPanel();

        UIHome uiHome = new UIHome(cards);
        JPanel homePanel = uiHome.getPanel();

        ElegirEscenario elegirEscenario = new ElegirEscenario(cards);
        JPanel elegirEscenarioPanel = elegirEscenario.getPanel();

        ElegirPersonaje elegirPersonaje = new ElegirPersonaje(cards);
        JPanel elegirPersonajePanel = elegirPersonaje.getPanel();




        cards.add(loginPanel, "Login");
        cards.add(homePanel, "Home");
        cards.add(elegirEscenarioPanel, "ElegirEscenario");
        cards.add(elegirPersonajePanel, "ElegirPersonaje");

        mainFrame.add(cards);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    /*
    public void showLoginUI() {
        System.out.println("UIController.showLoginUI");
        mainFrame.setContentPane(new LoginUI().panel1);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
    }
    public void showHomeUI() {
        System.out.println("UIController.showHomeUI");
        mainFrame.setContentPane(new UIHome().HomePanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

     */

    public void showCardHomeUI() {
        System.out.println("UIController.showCardHomeUI");
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, "Home");

        //mainFrame.revalidate();
        //mainFrame.repaint();
    }

    public void changeScreen(String screenName){
        ((CardLayout)cards.getLayout()).show(cards, screenName);
    }

}
