/*
Author: Dinesh Sinnathamby
Date: November 21st, 2026
Description: Creates a portrait of myself using JPanel.
*/

import javax.swing.*;
import java.awt.*;

public class Q3 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.WHITE);

        g.setColor(Color.ORANGE);
        g.fillRect(100, 220, 200, 130);

        g.setColor(new Color(180, 130, 90));
        g.fillOval(120, 50, 160, 190);

        g.setColor(Color.BLACK);
        g.fillArc(120, 40, 160, 100, 0, 180);

        g.setColor(Color.WHITE);
        g.fillOval(150, 120, 30, 20);
        g.fillOval(220, 120, 30, 20);

        g.setColor(Color.BLACK);
        g.fillOval(160, 125, 12, 12);
        g.fillOval(230, 125, 12, 12);

        g.drawLine(200, 145, 190, 175);
        g.drawLine(190, 175, 205, 175);

        g.drawArc(170, 170, 60, 35, 180, 180);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));

        g.drawString("Dinesh Sinnathamby", 90, 390);
        g.drawString("November 21, 2026", 100, 420);
    }

    public static void main(String[] args) {

        JFrame window = new JFrame("Self Portrait");

        Q3 panel = new Q3();
        window.add(panel);

        window.setSize(420, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}