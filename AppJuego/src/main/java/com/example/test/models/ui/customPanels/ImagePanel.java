package com.example.test.models.ui.customPanels;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel
{
    private static final long serialVersionUID = 1L;
    private Image image = null;
    private int iWidth2;
    private int iHeight2;

    public ImagePanel(LayoutManager layout,Image image)
    {
        this.image = image;
        this.iWidth2 = image.getWidth(this)/2;
        this.iHeight2 = image.getHeight(this)/2;
        setLayout(layout);
        setOpaque(false);
    }
    @Override
    public boolean isValidateRoot()
    {
        return true;
    }

    @Override
    public Component add(Component component)
    {
        super.add(component);
        revalidate();
        repaint();
        return component;
    }


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (image != null)
        {
            int x = this.getParent().getWidth()/2 - iWidth2;
            int y = this.getParent().getHeight()/2 - iHeight2;
            g.drawImage(image,x,y,this);
        }
    }

    //setLayout(new BorderLayout());
    public void setLayout(LayoutManager mgr)
    {
        super.setLayout(mgr);
        revalidate();
        repaint();
    }
}
