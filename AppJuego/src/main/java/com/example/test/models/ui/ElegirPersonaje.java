package com.example.test.models.ui;

import com.example.test.UIController;
import com.example.test.models.CharacterModel;
import com.example.test.models.PeleaBasica;
import com.example.test.models.ui.customPanels.PanelUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

        Imagen1 = PanelUtils.getIconLabelStream("/Assets/LogosPersonaje/Protagonistas/David.jpg",200,300);
        Imagen2 = PanelUtils.getIconLabelStream("/Assets/LogosPersonaje/Protagonistas/Lucy.jpg",200,300);
        Imagen3 = PanelUtils.getIconLabelStream("/Assets/LogosPersonaje/Protagonistas/Maine.jpg",200,300);
        Imagen4 = PanelUtils.getIconLabelStream("/Assets/LogosPersonaje/Protagonistas/rebecca.jpg",200,300);

    }

    public void elegirPersonaje(int personaje) {
        CharacterModel heroe ;
        switch (personaje) {
            case 1:
                //Personaje 1
                heroe = new CharacterModel("David", 100L);
                heroe.setIconPath("/Assets/LogosPersonaje/Protagonistas/David.jpg");
                break;
            case 2:
                //Personaje 2
                heroe = new CharacterModel("Lucy", 100L);
                heroe.setIconPath("/Assets/LogosPersonaje/Protagonistas/Lucy.jpg");
                break;
            case 3:
                //Personaje 3
                heroe = new CharacterModel("Maine", 100L);
                heroe.setIconPath("/Assets/LogosPersonaje/Protagonistas/Maine.jpg");
                break;
            case 4:
                //Personaje 4
                heroe = new CharacterModel("Rebecca", 100L);
                heroe.setIconPath("/Assets/LogosPersonaje/Protagonistas/rebecca.jpg");
                break;
            default:
                heroe = new CharacterModel("David", 100L);
                heroe.setIconPath("/Assets/LogosPersonaje/Protagonistas/David.jpg");
                break;
        }
        //TODO guardar los personajes
        PeleaBasica.getInstance().setCharacterModel(heroe); //para PeleaBasica
        //PlayerModel.getInstance().elegirPersonaje(heroe);
        CardLayout cl = (CardLayout)cards.getLayout();

        cl.show(cards, "Pelea");
        UIController.getInstance().getPeleaUI().updateEscenario();
    }

    public JPanel getPanel() {
        return ElegirPanel;
    }


}
