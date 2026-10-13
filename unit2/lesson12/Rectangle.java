/*
Author: Dinesh Sinnathamby
Date: October 12th, 2026
Description: Calculates a rectangle's area and perimeter using its length and width.
*/

public class Rectangle extends Shape2D {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (!Double.isFinite(length) || !Double.isFinite(width)
                || length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive, finite numbers.");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
