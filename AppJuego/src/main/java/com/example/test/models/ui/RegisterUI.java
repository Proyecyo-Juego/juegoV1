package com.example.test.models.ui;

import javax.swing.*;
import java.awt.*;

public class RegisterUI {

    private JPanel frame;
    public JPanel RegisterPanel;
    private JTextField usernameField;
    private JTextField mailField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public RegisterUI(JPanel mainframe){
        this.frame = mainframe;
        addComponents();
    }

    public void addComponents() {
        registerButton.addActionListener(e -> {
            System.out.println("Register");
            Register();
        });
    }

    private void Register() {
        CardLayout cl = (CardLayout)frame.getLayout();
        cl.show(frame, "Login");
    }

    public JPanel getPanel(){
        return RegisterPanel;
    }

}
