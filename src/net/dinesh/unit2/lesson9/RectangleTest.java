/*
Author: Dinesh Sinnathamby
Date: October 6th, 2026
Description: Tests rectangle coordinates, the filled setting, and handling negative coordinates.
*/

package net.dinesh.unit2.lesson9;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setX1(2);
        rectangle.setY1(3);
        rectangle.setX2(8);
        rectangle.setY2(9);
        rectangle.setFilled(true);

        System.out.println(rectangle);
        System.out.println("First corner: " + rectangle.getX1() + ", " + rectangle.getY1());
        System.out.println("Second corner: " + rectangle.getX2() + ", " + rectangle.getY2());
        System.out.println("Filled: " + rectangle.getFilled());

        rectangle.setX1(-2);
        rectangle.setY1(-3);
        rectangle.setX2(-8);
        rectangle.setY2(-9);
        rectangle.setFilled(false);
        System.out.println("After negative coordinates: " + rectangle);
    }
}
