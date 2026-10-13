/*
Author: Dinesh Sinnathamby
Date: October 12th, 2026
Description: Validates triangle sides and calculates area using Heron's formula and perimeter.
*/

public class Triangle extends Shape2D {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (!Double.isFinite(a) || !Double.isFinite(b) || !Double.isFinite(c)
                || a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Triangle sides must be positive, finite numbers.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("The sum of any two sides must be greater than the third side.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
