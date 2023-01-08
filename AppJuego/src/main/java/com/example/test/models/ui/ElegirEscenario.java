package com.example.test.models.ui;

import com.example.test.models.escenario.Escenario;
import com.example.test.models.ui.customPanels.PanelUtils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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

        Imagen1 = PanelUtils.getIconLabel("AppJuego/Assets/FondosEscenario/Escenario1.jpg",400,300);
        Imagen2 = PanelUtils.getIconLabel("AppJuego/Assets/FondosEscenario/Escenario2.jpg",400,300);
        Imagen3 = PanelUtils.getIconLabel("AppJuego/Assets/FondosEscenario/Escenario3.jpg",400,300);
        Imagen4 = PanelUtils.getIconLabel("AppJuego/Assets/FondosEscenario/Escenario4.jpg",400,300);

    }

    private void elegirEscenario(int numero){
        switch(numero){
            case 1:
                //Escenario 1
                Escenario.elegirEscena("1");
                break;
            case 2:
                //Escenario 2
                Escenario.elegirEscena("2");
                break;
            case 3:
                //Escenario 3
                Escenario.elegirEscena("3");
                break;
            case 4:
                //Escenario 4
                Escenario.elegirEscena("4");
                break;
            default:
                //Escenario por defecto
                Escenario.elegirEscena("1");
                break;
        }
        //Escenario.getInstance().setEscenario(escena);
        System.out.println("Escenario elegido: " +numero);
        //Abrir ventana de elegir personaje
        CardLayout cl = (CardLayout)cards.getLayout();
        cl.show(cards, "ElegirPersonaje");

    }
    public JPanel getPanel(){
        return ElegirPanel;
    }

    private JLabel getImageIcon(String path , int w, int h){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image imgscaled = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);

        return new JLabel(new ImageIcon(imgscaled));
    }
}
