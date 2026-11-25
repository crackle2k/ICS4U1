/*
Author: Dinesh Sinnathamby
Date: November 24th, 2026
Description: Draws random lines continuously and clears the screen after 100 lines.
*/

import javax.swing.*;
import java.awt.*;

public class Q3 extends JPanel {

    private int[] x1 = new int[100];
    private int[] y1 = new int[100];
    private int[] x2 = new int[100];
    private int[] y2 = new int[100];
    private int lineCount = 0;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (lineCount == 100) {
            lineCount = 0;
        }

        x1[lineCount] = (int)(Math.random() * getWidth());
        y1[lineCount] = (int)(Math.random() * getHeight());
        x2[lineCount] = (int)(Math.random() * getWidth());
        y2[lineCount] = (int)(Math.random() * getHeight());
        lineCount++;

        for (int i = 0; i < lineCount; i++) {
            g.drawLine(x1[i], y1[i], x2[i], y2[i]);
        }

        System.out.println("Call repaint function");
        repaint();
    }

    public static void main(String[] args) {

        JFrame window = new JFrame("Screensaver");

        Q3 panel = new Q3();
        window.add(panel);

        window.setSize(420, 420);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
