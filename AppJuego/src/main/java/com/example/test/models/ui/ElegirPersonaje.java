package com.example.test.models.ui;

import com.example.test.controllers.UIController;
import com.example.test.models.CharacterModel;
import com.example.test.models.PeleaBasica;

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

public class ElegirPersonaje {

    private JPanel cards;
    public JPanel JuegoPanel;
    public JPanel ElegirPanel;
    private JButton Volver;
    private JPanel Panel1;
    private JLabel Imagen1;
    private JPanel Panel2;
    private JLabel Imagen2;
    private JPanel Panel3;
    private JLabel Imagen3;
    private JPanel Panel4;
    private JLabel Imagen4;

    private static final long serialVersionUID = 1L;


    public ElegirPersonaje(JPanel cards) {

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
                elegirPersonaje(1);
            }
        });
        Panel2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                elegirPersonaje(2);
            }
        });
        Panel3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                elegirPersonaje(3);
            }
        });
        Panel4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                elegirPersonaje(4);
            }
        });
    }

    private void createUIComponents() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("AppJuego/David.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image imgscaled = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);

        Imagen1 = getImageIcon("AppJuego/Assets/LogosPersonaje/Protagonistas/David.jpg",200,200);
        Imagen2 = getImageIcon("AppJuego/Assets/LogosPersonaje/Protagonistas/Lucy.jpg",200,200);
        Imagen3 = getImageIcon("AppJuego/Assets/LogosPersonaje/Protagonistas/Maine.jpg",200,200);
        Imagen4 = getImageIcon("AppJuego/Assets/LogosPersonaje/Protagonistas/rebecca.jpg",200,200);

    }

    public void elegirPersonaje(int personaje) {
        CharacterModel heroe ;
        switch (personaje) {
            case 1:
                //Personaje 1
                heroe = new CharacterModel("David", 100L);
                heroe.setIconPath("AppJuego/Assets/LogosPersonaje/Protagonistas/David.jpg");
                break;
            case 2:
                //Personaje 2
                heroe = new CharacterModel("Lucy", 100L);
                heroe.setIconPath("AppJuego/Assets/LogosPersonaje/Protagonistas/Lucy.jpg");
                break;
            case 3:
                //Personaje 3
                heroe = new CharacterModel("Maine", 100L);
                heroe.setIconPath("AppJuego/Assets/LogosPersonaje/Protagonistas/Maine.jpg");
                break;
            case 4:
                //Personaje 4
                heroe = new CharacterModel("Rebecca", 100L);
                heroe.setIconPath("AppJuego/Assets/LogosPersonaje/Protagonistas/rebecca.jpg");
                break;
            default:
                heroe = new CharacterModel("David", 100L);
                heroe.setIconPath("AppJuego/Assets/LogosPersonaje/Protagonistas/David.jpg");
                break;
        }
        //TODO David, cuando te decidas en como vas a guardar los personajes, ponlo aqui
        PeleaBasica.getInstance().setCharacterModel(heroe); //para PeleaBasica
        //PlayerModel.getInstance().elegirPersonaje(heroe);
        CardLayout cl = (CardLayout)cards.getLayout();

        cl.show(cards, "Pelea");
        UIController.getInstance().getPeleaUI().updateEscenario();
    }

    public JPanel getPanel() {
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
