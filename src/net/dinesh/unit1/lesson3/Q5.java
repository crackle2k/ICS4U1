/*
Author: Dinesh Sinnathamby
Date: September 11th, 2026
Description: Short program converting an angle in degrees to radians.
*/

package net.dinesh.unit1.lesson3;

public class Q5 {
    public static void main(String[] args) {

        double degrees = 50;
        double rad = degrees * Math.PI/180;

        System.out.println("The degrees in radians are " + rad + " radians.");
    }
}
