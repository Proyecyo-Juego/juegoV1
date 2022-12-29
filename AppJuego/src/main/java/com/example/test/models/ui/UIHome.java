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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            // JOptionPane.setRootFrame(null);
            if (a == JOptionPane.YES_OPTION) {
                dispose();
                UILogin obj = new UILogin();
                obj.setTitle("Login");
                obj.setVisible(true);
            }
            dispose();
            UILogin obj = new UILogin();

            obj.setTitle("Login");
            obj.setVisible(true);

        }
    });


}
}
