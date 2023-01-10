package com.example.test.models.ui;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterUI {

    private JPanel frame;
    public JPanel RegisterPanel;
    private JTextField usernameField;
    private JTextField mailField;
    private JPasswordField passwordField;
    private JButton registerButton;
    private JButton Volver;
    PreparedStatement ps;
    ResultSet rs;

    public RegisterUI(JPanel mainframe) {
        this.frame = mainframe;
        addComponents();
        Volver.addActionListener(e -> {
            System.out.println("Volver");
            CardLayout cl = (CardLayout) frame.getLayout();
            cl.show(frame, "Login");
        });
    }

    public void addComponents() {
        registerButton.addActionListener(e -> {
            System.out.println("Register");
            Register();
        });
    }

    private void Register() {
        Connection con = null;
        try {
            con = LoginUI.getConnection();
            ps = con.prepareStatement("INSERT INTO users(user,mail,password) VALUES(?,?,?)");
            ps.setString(1, usernameField.getText());
            ps.setString(2, mailField.getText());
            ps.setString(3, passwordField.getText());
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "usuario registrado con exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "error al registrar el usuario");
                limpiar();
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al insertar el usuario en la base de datos");
        }
        CardLayout cl = (CardLayout) frame.getLayout();
        cl.show(frame, "Login");
    }

    public void limpiar() {
        usernameField.setText(null);
        mailField.setText(null);
        passwordField.setText(null);
    }

    public JPanel getPanel() {
        return RegisterPanel;
    }

}
