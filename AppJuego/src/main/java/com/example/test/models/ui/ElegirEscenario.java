package com.example.test.models.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElegirEscenario {
    private JPanel ElegirPanel;
    private JLabel Escenario2;
    private JLabel Escenario3;
    private JLabel Escenario4;
    //private JLabel ImageLogo;
    private JButton Volver;
    private JPanel Panel1;
    private JLabel Imagen1;

    private ImageIcon icon;



    public ElegirEscenario() {



        Volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Volver a la ventana anterior

                new UIHome().main(null);
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ElegirEscenario");
        frame.setContentPane(new ElegirEscenario().ElegirPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

        //Imagen1 = new JLabel(new ImageIcon("fondo.png","Ciudad 1"));
        ImageIcon icon = new ImageIcon("fondo.png");

        Imagen1 = new JLabel(icon);


    }
}
