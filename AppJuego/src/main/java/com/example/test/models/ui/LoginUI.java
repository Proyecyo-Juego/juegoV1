package com.example.test.models.ui;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class LoginUI {

    private JPanel frame;
    public JPanel panel1;
    private JLabel TitleLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;
    private JButton InvitadoLocal;

    public static final String URl = "jdbc:mysql://localhost/logingamecyberpunk";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URl, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    public void validate() {
        int result = 0;
        Connection con = getConnection();
        try {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());
            String sql = "SELECT * FROM users WHERE user='" + username + "'and password='" + password + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                result = 1;
                if (result == 1) {
                    CardLayout cl = (CardLayout) frame.getLayout();
                    cl.show(frame, "Home");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error de usuario y contraseña");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
        }
    }

    public LoginUI(JPanel mainframe) {
        this.frame = mainframe;
        addComponents();
        InvitadoLocal.addActionListener(e -> {
            System.out.println("Invitado");
            CardLayout cl = (CardLayout) frame.getLayout();
            cl.show(frame, "Home");
        });
    }

    public void addComponents() {
        loginButton.addActionListener(e -> {
            System.out.println("Login");
            validate();
            //Login();
        });

        registerButton.addActionListener(e -> {
            Register();
        });
    }

    //Ya no hace falte este metodo
    public void Login() {
        //TODO: login
        String userName = usernameField.getText();
        String password = passwordField.getText();


        CardLayout cl = (CardLayout) frame.getLayout();
        cl.show(frame, "Home");
    }

    public void Register() {
        CardLayout cl = (CardLayout) frame.getLayout();
        cl.show(frame, "Register");
    }

    public JPanel getPanel() {
        return panel1;
    }
}
