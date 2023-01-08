package com.example.test.models.ui;

import com.example.test.models.PeleaBasica;
import com.example.test.controllers.SoundManager;
import com.example.test.models.escenario.Escenario;
import com.example.test.models.ui.customPanels.ImagePanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PeleaUI {
    private final JPanel cards;
    private JPanel panelPelea;
    private JButton returnButton;
    private ImagePanel imagePanel1;
    private JLabel Hero1Image;
    private JLabel Hero1Name;
    private JProgressBar Hero1HpBar1;
    private JLabel Enemy1Image;
    private JProgressBar Enemy1HpBar;
    private JLabel Enemy1Name;
    private JButton DefendButton;
    private JButton AttackButton;
    private JButton button1;
    private JLabel LogMSG;

    BufferedImage backgroundImage;
public PeleaUI(JPanel cards) {
    this.cards = cards;

    returnButton.addActionListener(e -> {
        CardLayout cl = (CardLayout) this.cards.getLayout();
        cl.show(this.cards, "Home");
    });


    AttackButton.addActionListener(e -> {
        clickAttack();

    });

    DefendButton.addActionListener(e -> {
        clickDefend();
    });


}

    private void clickAttack() {
    System.out.println("Attack");
    //TODO: implementar
        LogMSG.setText(PeleaBasica.getInstance().attackEnemy1());
        updateHPbars();
        if(PeleaBasica.getInstance().getPlayerTurn()==false){
            //Ataca la IA
            if (PeleaBasica.getInstance().getEnemy1HP() > 0) {
                System.out.println("Timer de contraataque enemigo iniciado");
                javax.swing.Timer timer = new javax.swing.Timer(1000, e -> {
                    PeleaBasica.getInstance().enemyTurn();
                    updateHPbars();
                });
                timer.setRepeats(false);
                timer.start();
            }
            else {
                System.out.println("Pelea terminada");
                LogMSG.setText("Has ganado!");
                SoundManager.SonidoVictoria();
                JOptionPane.showMessageDialog(null, "Has ganado!");
                CardLayout cl = (CardLayout) this.cards.getLayout();
                cl.show(this.cards, "Home");
            }
        }
    }
    private void clickDefend() {
    System.out.println("Defend");
    //TODO: implementar
    }

    private void createUIComponents() {

        try {
            backgroundImage = ImageIO.read(new File("AppJuego/fondo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imagePanel1 = new ImagePanel(new GridLayout(),backgroundImage);

        Hero1Image = getIconLabel("AppJuego/Assets/LogosPersonaje/Protagonistas/David.jpg", 300, 400);
        Enemy1Image = getIconLabel("AppJuego/Assets/LogosPersonaje/Protagonistas/David.jpg", 300, 400);



    }

    public void setBackgroundImage(BufferedImage backgroundImage) {
        this.backgroundImage = backgroundImage;
        imagePanel1.setImage(backgroundImage);
    }
    public void setBackgroundImage(Image backgroundImage) {
        this.backgroundImage = toBufferedImage(backgroundImage);
        imagePanel1.setImage(this.backgroundImage);
    }

    public void updateEscenario(){
    initPelea();
    BufferedImage img = null;
        try {
            img = ImageIO.read(new File(Escenario.getInstance().getBackgroundPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image imgscaled = img.getScaledInstance(1280,720, Image.SCALE_SMOOTH);
        setBackgroundImage(imgscaled);

        Hero1Image.setIcon(getImageIcon(PeleaBasica.getInstance().getCharacterModel().getIconPath(), 300, 400));
        Hero1Image.revalidate();
        Hero1Image.repaint();
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
    public void initPelea(){
        PeleaBasica.getInstance().initPeleaBasica(100);
        updateHPbars();
    }

    public void updateHPbars(){
        Hero1HpBar1.setValue(PeleaBasica.getInstance().getHeroHP());
        Enemy1HpBar.setValue(PeleaBasica.getInstance().getEnemy1HP());
    }


    public JPanel getPanel() {
        return panelPelea;
    }

    public JLabel getIconLabel(String path , int w, int h){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image imgscaled = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);

        return new JLabel(new ImageIcon(imgscaled));
    }
    public ImageIcon getImageIcon(String path , int w, int h){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image imgscaled = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);

        return new ImageIcon(imgscaled);
    }

    public void setLogMSG(String msg){
        LogMSG.setText(msg);
    }

    public void derrota(){
        LogMSG.setText("Has perdido!");
        SoundManager.SonidoDerrota();
        JOptionPane.showMessageDialog(null, "Has perdido!");
        CardLayout cl = (CardLayout) this.cards.getLayout();
        cl.show(this.cards, "Home");
    }

}
