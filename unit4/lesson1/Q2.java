/*
Author: Dinesh Sinnathamby
Date: November 21st, 2026
Description: Uses loops and control statements to generate interesting patterns using lines.
*/

import javax.swing.*;
import java.awt.*;

public class Q2 extends JPanel {

    private int choice;

    public Q2(int choice) {
        this.choice = choice;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (choice == 1) {
            for (int i = 0; i < 12; i++) {
                g.drawOval(10 + i * 8, 10 + i * 8,
                           30 + i * 8, 30 + i * 8);
            }

        } else if (choice == 2) {
            for (int i = 0; i < 12; i++) {
                g.drawRect(10 + i * 8, 10 + i * 8,
                           30 + i * 8, 30 + i * 8);
            }
        }
    }

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(
            "Enter 1 for circles or 2 for squares:"
        );

        if (input == null) {
            return;
        }

        int choice = Integer.parseInt(input);

        JFrame window = new JFrame("Shape Designs");

        Q2 panel = new Q2(choice);
        window.add(panel);

        window.setSize(250, 250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}