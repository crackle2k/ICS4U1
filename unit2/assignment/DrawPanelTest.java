/*
Authors: Dinesh Sinnathamby and Ethan Gopikrishna
Date: October 16th, 2026
Description: Main program that asks for a positive number of shapes and displays a drawing panel with the number of each shape.
*/

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class DrawPanelTest {

    public static void main(String[] args) {

        int numberOfShapes = 0;

        while (numberOfShapes <= 0) {
            String input = JOptionPane.showInputDialog(
                null, "How many shapes would you like to draw?"
            );

            if (input == null) {
                return;
            }

            try {
                numberOfShapes = Integer.parseInt(input);

                if (numberOfShapes <= 0) {
                    JOptionPane.showMessageDialog(
                        null, "Please enter a positive integer."
                    );
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                    null, "Invalid input. Please enter an integer."
                );
            }
        }

        JFrame frame = new JFrame("Drawing with Polymorphism");

        DrawPanel panel = new DrawPanel(numberOfShapes);

        JLabel status = new JLabel(
            "Lines: " + panel.getLineCount()
            + " | Rectangles: " + panel.getRectangleCount()
            + " | Ovals: " + panel.getOvalCount(),
            SwingConstants.CENTER
        );

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(status, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
