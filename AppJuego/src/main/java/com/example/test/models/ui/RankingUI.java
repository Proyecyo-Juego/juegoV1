package com.example.test.models.ui;

import com.example.test.controllers.RankingManager;
import com.example.test.models.ui.customPanels.ImagePanel;
import com.example.test.models.ui.customPanels.PanelUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class RankingUI {
    private ImagePanel imagePanel1;
    private JPanel panel1;
    private JButton ReturnButton;
    private JScrollPane ScrollPane;
    private JPanel RankingPanel;

    private BufferedImage backgroundImage;

    private RankingManager rankingManager;

    private String usuarioActivo;


    public RankingUI() {
        rankingManager = RankingManager.getInstance();

        ReturnButton.addActionListener(e -> {
            CardLayout cl = (CardLayout) this.panel1.getParent().getLayout();
            cl.show(this.panel1.getParent(), "Home");
        });
    }

    private void createUIComponents() {
        imagePanel1 = new ImagePanel(new GridLayout(), PanelUtils.readScaledImageStream("/Assets/FondosEscenario/AfterLifeRanking.jpg", 1280, 720));
    }

    private JPanel CreateRankingPanel(int i, String PlayerName, String CharacterName, int score) {
        JPanel returner = new JPanel();
        returner.setLayout(new FlowLayout());
        JLabel label = new JLabel();
        label.setText(i + " " + PlayerName + " " + CharacterName + " " + score);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        returner.add(label);
        returner.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));
        returner.setOpaque(true);
        return returner;
    }

    public void updateRanking() {
        System.out.println("Updating Ranking");
        System.out.println(rankingManager.getRankingList().size());
        rankingManager.print();
        try {
            RankingPanel.removeAll();
        } catch (Exception e) {
            System.out.println("No hay ranking");
        }
        RankingPanel = new JPanel();
        RankingPanel.setLayout(new BoxLayout(RankingPanel, BoxLayout.Y_AXIS));
        for (int i = 0; i < rankingManager.getRankingList().size(); i++) {
            RankingPanel.add(CreateRankingPanel(i + 1, rankingManager.getRankingList().get(i).getPlayerName(), rankingManager.getRankingList().get(i).getCharacterName(), rankingManager.getRankingList().get(i).getScore()));
        }
        ScrollPane.setViewportView(RankingPanel);
        ScrollPane.setVisible(true);
        ScrollPane.revalidate();
        ScrollPane.repaint();
    }

    public JPanel getPanel() {
        return panel1;
    }

    public void setUsuarioActivo(String usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }
    public String getUsuarioActivo() {
        return usuarioActivo;
    }

}
