/*
Authors: Dinesh Sinnathamby and Ethan Gopikrishna
Date: October 16th, 2026
Description: Drawing panel that creates random lines, rectangles, and ovals, displays them, and tracks the number of each shape.
*/

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    private MyShape[] shapes;

    private int lineCount;
    private int rectangleCount;
    private int ovalCount;

    public DrawPanel(int numberOfShapes) {
        Random random = new Random();

        shapes = new MyShape[numberOfShapes];

        for (int i = 0; i < shapes.length; i++) {

            int x1 = random.nextInt(400);
            int y1 = random.nextInt(400);
            int x2 = random.nextInt(400);
            int y2 = random.nextInt(400);

            Color color = new Color(
                random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256)
            );

            int shapeType = random.nextInt(3);
            boolean filled = random.nextBoolean();

            if (shapeType == 0) {
                shapes[i] = new MyLine(x1, y1, x2, y2, color);
                lineCount++;
            } else if (shapeType == 1) {
                shapes[i] = new MyRectangle(x1, y1, x2, y2, color, filled);
                rectangleCount++;
            } else {
                shapes[i] = new MyOval(x1, y1, x2, y2, color, filled);
                ovalCount++;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (MyShape shape : shapes) {
            shape.draw(g);
        }
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getRectangleCount() {
        return rectangleCount;
    }

    public int getOvalCount() {
        return ovalCount;
    }
}
