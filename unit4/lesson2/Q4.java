/*
Author: Dinesh Sinnathamby
Date: November 24th, 2026
Description: Uses a Timer to draw random lines and clears the screen after 100 lines.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q4 extends JPanel implements ActionListener {

    private int[] x1 = new int[100];
    private int[] y1 = new int[100];
    private int[] x2 = new int[100];
    private int[] y2 = new int[100];
    private int lineCount = 0;
    private Timer timer;

    public Q4() {
        timer = new Timer(1000, this);
        timer.start();
    }

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

        // Redraw the saved lines because super.paintComponent(g) clears the panel.
        for (int i = 0; i < lineCount; i++) {
            g.drawLine(x1[i], y1[i], x2[i], y2[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        repaint();
    }

    // The timer normally adds one line each second, reducing processing and console output.
    public static void main(String[] args) {

        JFrame window = new JFrame("Timer Screensaver");

        Q4 panel = new Q4();
        window.add(panel);

        window.setSize(420, 420);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
