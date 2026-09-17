/*
Author: Dinesh Sinnathamby
Date: September 17th, 2026
Description: Short program demonstrated the use of different loops in python, including the for loop, while loop, and do-while loop.
*/

package net.dinesh.unit1.lesson7;

public class Q2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("*".repeat(i));
        }

        System.out.println();

        int i = 10;
        while (i > 0) {
            System.out.println("*".repeat(i));
            i--;
        }

        System.out.println();

        int f = 0;
        for (int j = 10; j > 0; j--) {
            System.out.println(" ".repeat(f) + "*".repeat(j));
            f++;
        }

        int a = 10, b = 0;
        do {
            System.out.println(" ".repeat(a) + "*".repeat(b));
            a--;
            b++;
        } while (a > 0);
    }
}
