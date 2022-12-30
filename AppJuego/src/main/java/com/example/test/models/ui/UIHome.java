package com.example.test.models.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UIHome extends JFrame {

    JFrame frame;
    private JButton LogoutButton;
    private JPanel HomePanel;
    private JButton rankingButton;
    private JButton JugarButton;

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    UIHome frame = new UIHome();
                    frame.setContentPane(new UIHome().HomePanel);
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
public UIHome() {



    LogoutButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Logout");
            JButton btnNewButton = new JButton("Logout");
            int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
            if (a == JOptionPane.YES_OPTION) {
                //Cerrado de sesion confirmado, destruyendo ventana actual

                SwingUtilities.getWindowAncestor(HomePanel).dispose();


                UILogin obj = new UILogin();
                obj.setTitle("Login");
                obj.setVisible(true);
            }


        }
    });


    rankingButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Abrir ventana de ranking
            //Aun no implementado
            /*
            System.out.println("Ranking");
            SwingUtilities.getWindowAncestor(HomePanel).dispose();
            JFrame frame = new JFrame("UIRanking");
            frame.setContentPane(new UIRanking().RankingPanel);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
             */
        }
    });
    JugarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Abrir ventana de juego

            System.out.println("Jugar");

            //dispose();
            SwingUtilities.getWindowAncestor(HomePanel).dispose();

            new ElegirEscenario().main(null);




        }
    });
}
}
