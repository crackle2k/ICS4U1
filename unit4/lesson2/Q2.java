/*
Author: Dinesh Sinnathamby
Date: November 23rd, 2026
Description: Creates a spiral shape using the drawPolyline() Graphics method.
*/

import javax.swing.*;
import java.awt.*;

public class Q2 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int[] xPoints = new int[21];
        int[] yPoints = new int[21];

        for (int i = 0; i < xPoints.length; i++) {
            int radius = 10 + i * 7;
            double angle = -i * Math.PI / 4;

            xPoints[i] = getWidth() / 2 + (int)(radius * Math.cos(angle));
            yPoints[i] = getHeight() / 2 + (int)(radius * Math.sin(angle));
        }

        g.drawPolyline(xPoints, yPoints, xPoints.length);
    }

    public static void main(String[] args) {

        JFrame window = new JFrame("Spiral");

        Q2 panel = new Q2();
        window.add(panel);

        window.setSize(420, 420);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
