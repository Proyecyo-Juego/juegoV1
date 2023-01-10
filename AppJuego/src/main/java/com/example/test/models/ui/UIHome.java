package com.example.test.models.ui;

import com.example.test.controllers.UIController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIHome extends JFrame {

    private JPanel frame;
    private JButton LogoutButton;
    public JPanel HomePanel;
    private JButton rankingButton;
    private JButton JugarButton;

    private static final long serialVersionUID = 1L;

    public UIHome(JPanel cards) {

        this.frame = cards;

        LogoutButton.addActionListener(e -> {
            System.out.println("Logout");
            JButton btnNewButton = new JButton("Logout");
            int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
            if (a == JOptionPane.YES_OPTION) {
                CardLayout cl = (CardLayout) frame.getLayout();
                cl.show(frame, "Login");
            }
        });
        rankingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ranking");
                UIController.getInstance().getRankingUI().updateRanking();
                CardLayout cl = (CardLayout) frame.getLayout();
                cl.show(frame, "Ranking");
            }
        });
        JugarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Abrir ventana de juego

                System.out.println("Jugar");
                CardLayout cl = (CardLayout) frame.getLayout();
                cl.show(frame, "ElegirEscenario");
            }
        });
    }

    public JPanel getPanel() {
        return HomePanel;
    }
}
