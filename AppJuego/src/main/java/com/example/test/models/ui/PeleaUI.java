package com.example.test.models.ui;

import com.example.test.models.PlayerModel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PeleaUI {
    private JPanel panelPelea;

    //private JLabel backgroundPelea;
    private JButton returnButton;

    BufferedImage backgroundImage;
public PeleaUI(JPanel cards) {
    createUIComponents();

    returnButton.addActionListener(e -> {
        CardLayout cl = (CardLayout) cards.getLayout();
        cl.show(cards, "Home");
    });



    }

    private void createUIComponents() {


        panelPelea = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, this);
            }
        };

    }

    public void setBackgroundImage(BufferedImage backgroundImage) {
        this.backgroundImage = backgroundImage;
        panelPelea.repaint();
    }
    public void setBackgroundImage(Image backgroundImage) {
        this.backgroundImage = toBufferedImage(backgroundImage);
        panelPelea.repaint();
    }

    public void updateEscenario(){
    BufferedImage img = null;
        try {
            //img = ImageIO.read(new File("AppJuego/David.jpg"));
            img = ImageIO.read(new File(PlayerModel.getInstance().getEscenario().getBackgroundPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image imgscaled = img.getScaledInstance(1024, 512, Image.SCALE_SMOOTH);
        setBackgroundImage(imgscaled);
    }

    public static BufferedImage toBufferedImage(Image img)
    {
        if (img instanceof BufferedImage)
        {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        // Return the buffered image
        return bimage;
    }

    public void initBackground(){
        BufferedImage img = null;
        try {

            img = ImageIO.read(new File("AppJuego/fondo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image imgscaled = img.getScaledInstance(1024, 512, Image.SCALE_SMOOTH);
        setBackgroundImage(imgscaled);
    }


    public JPanel getPanel() {
        return panelPelea;
    }

}
