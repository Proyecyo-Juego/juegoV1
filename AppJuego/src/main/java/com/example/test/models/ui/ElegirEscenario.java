package com.example.test.models.ui;

import com.example.test.escenario.escenario;

import javax.swing.*;
import java.awt.event.*;

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

        Panel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                elegirEscenario(1);
            }
        });
        Panel2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                elegirEscenario(2);
            }
        });
        Panel3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                elegirEscenario(3);
            }
        });
        Panel4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                elegirEscenario(4);
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

    private void elegirEscenario(int numero){
        escenario escena;

        switch(numero){
            case 1:
                //Escenario 1
                escena = new escenario("ciudad", "AppJuego/fondo.png");
                break;
            case 2:
                //Escenario 2
                escena = new escenario("ciudad", "AppJuego/fondo.png");
                break;
            case 3:
                //Escenario 3
                escena = new escenario("ciudad", "AppJuego/fondo.png");
                break;
            case 4:
                //Escenario 4
                escena = new escenario("ciudad", "AppJuego/fondo.png");
                break;
            default:
                //Escenario por defecto
                escena = new escenario("ciudad", "AppJuego/fondo.png");
                break;
        }
        System.out.println("Escenario elegido: " + escena.getNombre());

        ElegirPanel.setVisible(false);


        //Abrir ventana de juego



    }
}
