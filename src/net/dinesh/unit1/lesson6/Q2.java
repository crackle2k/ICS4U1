/*
Author: Dinesh Sinnathamby
Date: September 16th, 2026
Description: Short program that finds the integer between 1 and 10000 with the largest number of divisors, without using an array.
*/

package net.dinesh.unit1.lesson6;

public class Q2 {
    public static void main(String[] args) {

        int maxDivisors = 1;
        int numWithMax = 1;

        for (int n = 2; n <= 10000; n++) {

            int divisors = 0;

            for (int divisor = 1; divisor <= n; divisor++) {
                if (n % divisor == 0) {
                    divisors++;
                }
            }

            if (divisors > maxDivisors) {
                maxDivisors = divisors;
                numWithMax = n;
            }
        }

        System.out.println("The number " + numWithMax + " has " + maxDivisors + " divisors.");
    }
}
