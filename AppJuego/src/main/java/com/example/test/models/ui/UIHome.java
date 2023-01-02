package com.example.test.models.ui;

import com.example.test.controllers.UIController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UIHome extends JFrame {

    private JPanel frame;
    private JButton LogoutButton;
    public JPanel HomePanel;
    private JButton rankingButton;
    private JButton JugarButton;

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {

    }
public UIHome(JPanel cards) {

    this.frame = cards;

    LogoutButton.addActionListener(e -> {
        System.out.println("Logout");
        JButton btnNewButton = new JButton("Logout");
        int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
        if (a == JOptionPane.YES_OPTION) {
            //Cerrado de sesion confirmado, destruyendo ventana actual
            /*
            SwingUtilities.getWindowAncestor(HomePanel).dispose();
            UILogin obj = new UILogin();
            obj.setTitle("Login");
            obj.setVisible(true);
             */
            UIController.getInstance().changeScreen("Login");
        }


    });


    rankingButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Abrir ventana de ranking
            //Aun no implementado
            System.out.println("Ranking");
        }
    });
    JugarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Abrir ventana de juego

            System.out.println("Jugar");

            //dispose();
            UIController.getInstance().changeScreen("ElegirEscenario");




        }
    });
}

        public JPanel getPanel(){
            return HomePanel;
        }
}
