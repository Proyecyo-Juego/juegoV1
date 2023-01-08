package com.example.test.models.ui;

import com.example.test.models.RankingScore;
import com.example.test.models.ui.customPanels.ImagePanel;
import com.example.test.models.ui.customPanels.PanelUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class RankingUI {
    private ImagePanel imagePanel1;
    private JPanel panel1;
    private JButton ReturnButton;

    private JList<RankingScore> RankingList;
    private JScrollPane ScrollPane;

    private BufferedImage backgroundImage;

    DefaultListCellRenderer renderer;


    public RankingUI() {

        ReturnButton.addActionListener(e -> {
            CardLayout cl = (CardLayout) this.panel1.getParent().getLayout();
            cl.show(this.panel1.getParent(), "Home");
        });

        renderer= new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                RankingScore score = (RankingScore) value;

                JLabel name = new JLabel(score.getName());
                JLabel scoreLabel = new JLabel(String.valueOf(score.getScore())+" puntos");
                panel.add(name);
                panel.add(scoreLabel);
                return panel;
            }
        };
        RankingList.setCellRenderer(renderer);
    }
    private void createUIComponents() {

        imagePanel1 = new ImagePanel(new GridLayout(), PanelUtils.readScaledImage("AppJuego/Assets/FondosEscenario/AfterLifeRanking.jpg", 1280, 720));

    }

    public void populateList(RankingScore[] scores) {
        for (int i = 0; i < 10; i++) {
            String name = "Player" + i;
            RankingScore score =new  RankingScore(name, i);
            //RankingList.add(score);
        }
    }


    public JPanel getPanel() {
        return panel1;
    }
}
