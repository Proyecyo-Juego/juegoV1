package com.example.test.models.ui;

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
    private JPanel ElegirPanel;
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

    public static void main(String[] args) {
        JFrame frame = new JFrame("ElegirPersonaje");
        frame.setContentPane(new ElegirPersonaje().ElegirPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



    public ElegirPersonaje() {
        Volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Volver a la ventana anterior
                SwingUtilities.getWindowAncestor(ElegirPanel).dispose();
                new UIHome().main(null);
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

        Imagen1 = new JLabel(new ImageIcon(imgscaled,"David"));
        Imagen2 = new JLabel(new ImageIcon(imgscaled,"David"));
        Imagen3 = new JLabel(new ImageIcon(imgscaled,"David"));
        Imagen4 = new JLabel(new ImageIcon(imgscaled,"David"));

    }

    public void elegirPersonaje(int personaje) {
        switch (personaje) {
            case 1:
                //Personaje 1
                break;
            case 2:
                //Personaje 2
                break;
            case 3:
                //Personaje 3
                break;
            case 4:
                //Personaje 4
                break;
        }

    }
}
