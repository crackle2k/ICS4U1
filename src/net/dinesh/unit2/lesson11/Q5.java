/*
Author: Dinesh Sinnathamby
Date: October 9th, 2026
Description: Draws line patterns using Java graphics and loops, with designs that automatically adjust when the window is resized.
*/

package net.dinesh.unit2.lesson10;

import javax.swing.*;
import java.awt.*;

public class Q5 extends JPanel {
    private boolean fourCorners;

    public Q5(boolean fourCorners) {
        this.fourCorners = fourCorners;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int steps = 15;

        for (int i = 0; i < steps; i++) {
            int x = (i + 1) * width / steps;
            int y = i * height / steps;

            g.drawLine(0, y, x, height);

            if (fourCorners) {
                g.drawLine(width, y, width - x, height);
                g.drawLine(0, height - y, x, 0);

                g.drawLine(width, height - y, width - x, 0);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Design 1");
        frame1.add(new Q5(false));
        frame1.setSize(500, 500);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

        JFrame frame2 = new JFrame("Design 2");
        frame2.add(new Q5(true));
        frame2.setSize(500, 500);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLocation(550, 0);
        frame2.setVisible(true);
    }
}
