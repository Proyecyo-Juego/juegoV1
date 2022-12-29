package com.example.test.models.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class UIHome extends JFrame {
    private JButton LogoutButton;
    private JPanel HomePanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("UIHome");
        frame.setContentPane(new UIHome().HomePanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
public UIHome() {

    LogoutButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Logout");
            JButton btnNewButton = new JButton("Logout");
            int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
            if (a == JOptionPane.YES_OPTION) {
                //Cerrado de sesion confirmado, destruyendo ventana actual
                //HomePanel.removeAll();
                JFrame.getWindows()[0].dispose();
                dispose();
                UILogin obj = new UILogin();
                obj.setTitle("Login");
                obj.setVisible(true);
            }


        }
    });


}
}