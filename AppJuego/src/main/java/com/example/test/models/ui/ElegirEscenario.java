package com.example.test.models.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElegirEscenario {
    private JPanel ElegirPanel;
    //private JLabel ImageLogo;
    private JButton Volver;
    private JPanel Panel1;
    private JLabel Imagen1;
    private JPanel Panel2;
    private JLabel Imagen2;
    private JPanel Panel3;
    private JLabel Imagen3;
    private JPanel Panel4;
    private JLabel Imagen4;

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

        //ImageIcon icon = new ImageIcon("fondo.png");

        //Imagen1 = new JLabel(icon);
        Imagen1 = new JLabel(new ImageIcon("AppJuego/fondoMini.png","Ciudad 1"));
        Imagen2 = new JLabel(new ImageIcon("AppJuego/fondoMini.png","Ciudad 2"));
        Imagen3 = new JLabel(new ImageIcon("AppJuego/fondoMini.png","Ciudad 3"));
        Imagen4 = new JLabel(new ImageIcon("AppJuego/fondoMini.png","Ciudad 4"));


    }
}
