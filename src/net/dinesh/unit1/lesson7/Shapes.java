/*
Author: Dinesh Sinnathamby
Date: September 17th, 2026
Description: Custom JPanel that draws ten nested rectangles, ovals, or concentric circles depending on the shape choice passed in by the user.
*/

package net.dinesh.unit1.lesson7;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel {
    private int choice;

    public Shapes(int userChoice) {
        choice = userChoice;
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        for (int i = 0; i < 10; i++) {
            switch (choice) {
                case 1:
                    g.drawRect(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;
                case 2:
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 3:
                    int centerX = getWidth() / 2;
                    int centerY = getHeight() / 2;
                    int radius = 10 + (i * 10);

                    g.drawOval(centerX - radius, centerY - radius,
                            radius * 2, radius * 2);
                    break;
            }
        }
    }
}