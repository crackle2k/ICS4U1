/*
Author: Dinesh Sinnathamby
Date: September 25th, 2026
Description: Short program using recursion to find the sum of all numbers leading up to a specified integer.
*/

package net.dinesh.unit2.lesson3;

public class Q4 {
    public static void main(String[] args) {
        int answer = sum(5);
        System.out.println(answer);
    }

    public static int sum ( int n ) {
        if (n == 0)
            return 0;
        else
            return n + sum(n - 1);

    }
}
