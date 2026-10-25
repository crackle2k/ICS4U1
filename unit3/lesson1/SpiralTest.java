/*
Author: Dinesh Sinnathamby
Date: October 21st, 2026
Description: Creates a window to display the spirals and circle pattern drawn by SpiralPanel.
*/

import javax.swing.JFrame;

public class SpiralTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Spiral Drawing");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.add(new SpiralPanel());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
