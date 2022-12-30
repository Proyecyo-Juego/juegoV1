package com.example.test.models.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class UIHome extends JFrame {
    private JButton LogoutButton;
    private JPanel HomePanel;
    private JButton rankingButton;
    private JButton JugarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("UIHome");
        frame.setContentPane(new UIHome().HomePanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

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
                //HomePanel.removeAll();
                JFrame.getWindows()[0].dispose();

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
            JFrame.getWindows()[0].dispose();
            new ElegirEscenario().main(null);



        }
    });
}
}
