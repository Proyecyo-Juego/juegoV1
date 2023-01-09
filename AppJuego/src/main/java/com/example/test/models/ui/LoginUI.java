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
    private JButton registerButton;

    public LoginUI(JPanel mainframe){
        this.frame = mainframe;
        addComponents();
    }

    public void addComponents(){
        loginButton.addActionListener(e -> {
            System.out.println("Login");
            Login();
        });

        registerButton.addActionListener(e -> {
            Register();
        });
    }

    public void Login(){
        //TODO: login
        String userName = usernameField.getText();
        String password = passwordField.getText();


        CardLayout cl = (CardLayout)frame.getLayout();
        cl.show(frame, "Home");
    }

    public void Register(){
        CardLayout cl = (CardLayout)frame.getLayout();
        cl.show(frame, "Register");
    }

    public JPanel getPanel(){
        return panel1;
    }
}
