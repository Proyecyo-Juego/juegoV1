package com.example.test.controllers;

import javax.swing.*;
import java.awt.*;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel that uses a CardLayout
        JPanel cardPanel = new JPanel(new CardLayout());

        // Add the card panel to the frame
        frame.add(cardPanel);

        // Create the menu card
        JPanel menuCard = new JPanel();
        JButton button1 = new JButton("Button 1");
        menuCard.add(button1);
        JButton button2 = new JButton("Button 2");
        menuCard.add(button2);

        // Create the second card
        OtherClass oc = new OtherClass(cardPanel);
        JPanel card2 = oc.getPanel();

        // Add the cards to the card panel
        cardPanel.add(menuCard, "Menu");
        cardPanel.add(card2, "Card 2");

        // Set up the action listeners for the buttons
        button1.addActionListener(e -> {
            CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
            cardLayout.show(cardPanel, "Card 2");
        });
        button2.addActionListener(e -> {
            CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
            cardLayout.show(cardPanel, "Menu");
        });

        frame.pack();
        frame.setVisible(true);
    }
}

class OtherClass {
    private JPanel cardPanel;
    private JPanel panel;

    public OtherClass(JPanel cardPanel) {
        this.cardPanel = cardPanel;
        panel = new JPanel();
        JButton backButton = new JButton("Back to menu");
        panel.add(backButton);
        JLabel label = new JLabel("This is card 2");
        panel.add(label);

        backButton.addActionListener(e -> {
            CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
            cardLayout.show(cardPanel, "Menu");
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}