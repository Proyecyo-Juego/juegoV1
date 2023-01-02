package com.example.test.models.ui;

import javax.swing.*;
import java.awt.*;

public class LoginUI {

    private JPanel frame;
    public JPanel panel1;
    private JLabel TitleLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginUI(JPanel mainframe){
        this.frame = mainframe;
        addComponents();

    }
    public void addComponents(){/*
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Login");
                Login();
            }
        });
        */
        loginButton.addActionListener(e -> {
            System.out.println("Login");
            Login();
        });
    }

    public void Login(){
        //TODO: login


        //UIController.getInstance().showCardHomeUI();
        //UIController.getInstance().changeScreen("Home");
        CardLayout cl = (CardLayout)frame.getLayout();
        cl.show(frame, "Home");
    }

    public JPanel getPanel(){
        return panel1;
    }
}
