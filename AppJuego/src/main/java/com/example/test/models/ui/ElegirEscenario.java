package com.example.test.models.ui;

import com.example.test.escenario.Escenario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ElegirEscenario extends JFrame {

    private JPanel cards;
    public JPanel ElegirPanel;
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

    private static final long serialVersionUID = 1L;




    public ElegirEscenario(JPanel cards) {

        this.cards = cards;



        Volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Volver a la ventana anterior
                CardLayout cl = (CardLayout)cards.getLayout();
                cl.show(cards, "Home");
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


    private void createUIComponents() {
        // TODO: place custom component creation code here

        Imagen1 = new JLabel(new ImageIcon("AppJuego/fondoMini.png","Ciudad 1"));
        Imagen2 = new JLabel(new ImageIcon("AppJuego/fondoMini.png","Ciudad 2"));
        Imagen3 = new JLabel(new ImageIcon("AppJuego/fondoMini.png","Ciudad 3"));
        Imagen4 = new JLabel(new ImageIcon("AppJuego/fondoMini.png","Ciudad 4"));

    }

    private void elegirEscenario(int numero){
        Escenario escena;

        switch(numero){
            case 1:
                //Escenario 1
                escena = new Escenario("ciudad", "AppJuego/fondo.png");
                break;
            case 2:
                //Escenario 2
                escena = new Escenario("ciudad", "AppJuego/fondo.png");
                break;
            case 3:
                //Escenario 3
                escena = new Escenario("ciudad", "AppJuego/fondo.png");
                break;
            case 4:
                //Escenario 4
                escena = new Escenario("ciudad", "AppJuego/fondo.png");
                break;
            default:
                //Escenario por defecto
                escena = new Escenario("ciudad", "AppJuego/fondo.png");
                break;
        }
        System.out.println("Escenario elegido: " + escena.getNombre());
        //Abrir ventana de elegir personaje
        CardLayout cl = (CardLayout)cards.getLayout();
        cl.show(cards, "ElegirPersonaje");

    }
    public JPanel getPanel(){
        return ElegirPanel;
    }
}
