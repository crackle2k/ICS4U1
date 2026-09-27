/*
Author: Dinesh Sinnathamby
Date: September 27th, 2026
Description: Short program finding the greatest common divisor using Euclid's algorithm and recursion.
*/

package net.dinesh.unit2.lesson3;

public class Q6 {
    public static void main(String[] args) {

        int a = 16, b = 8;
        int result = gcd(a, b);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
