/*
Author: Dinesh Sinnathamby
Date: September 11th, 2026
Description: Short program trying various exercises with order of operations, testing to see what output this code will result in.
*/

package net.dinesh.unit1.lesson3;

public class Q2 {
    public static void main(String[] args) {
        int t1 = 17;
        int t2 = 3;
        int t3 = 7;

        System.out.println("value = " + (t1 % t2 * 5 / t3));
        System.out.println("value = " + (t3 * (-5 / 2) + t2));
        System.out.println("value = " + (t3 + t1 * 4 + t1));
    }
}

// The outputs are 1, -11, and 92.