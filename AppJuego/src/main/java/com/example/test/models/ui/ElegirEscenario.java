package com.example.test.models.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElegirEscenario {
    private JPanel ElegirPanel;
    private JLabel Escenario1;
    private JLabel Escenario2;
    private JLabel Escenario3;
    private JLabel Escenario4;
    private JButton Volver;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ElegirEscenario");
        frame.setContentPane(new ElegirEscenario().ElegirPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
    public ElegirEscenario() {

        Escenario1.setIcon(new ImageIcon("src/main/resources/static/js/8bitlogo.jpg"));
        Escenario2.setIcon(new ImageIcon("src/main/resources/static/js/8bitlogo.jpg"));
        Escenario3.setIcon(new ImageIcon("src/main/resources/static/js/8bitlogo.jpg"));
        Escenario4.setIcon(new ImageIcon("src/main/resources/static/js/8bitlogo.jpg"));

        Volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Volver a la ventana anterior

                new UIHome().main(null);
            }
        });

    }
}
