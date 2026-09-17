/*
Author: Dinesh Sinnathamby
Date: September 17th, 2026
Description: Short program that prompts the user to pick a shape and displays the resulting drawing in a window using the Shapes panel.
*/

package net.dinesh.unit1.lesson7;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
    public static void main(String args[]) {

        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw rectangles\n" +
                "Enter 2 to draw ovals\n" +
                "Enter 3 to draw concentric circles"
        );

        int choice = Integer.parseInt(input);

        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
