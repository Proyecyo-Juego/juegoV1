package com.example.test.models.ui.customPanels;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelUtils {

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

    public static Image readScaledImage(String path, int width, int height) {
        BufferedImage img = null;
    try {
        img = ImageIO.read(new File(path));
    } catch (IOException e) {
        e.printStackTrace();
    }
    Image dimg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    return dimg;
    }
    public static ImageIcon getImageIcon(String path, int w, int h){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image imgscaled = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);

        return new ImageIcon(imgscaled);
    }
    public static JLabel getIconLabel(String path , int w, int h){
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
