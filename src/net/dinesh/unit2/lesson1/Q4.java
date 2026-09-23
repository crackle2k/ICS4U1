/*
Author: Dinesh Sinnathamby
Date: September 22nd, 2026
Description: Finds the maximum number of divisors for integers from 1 to 10000 and lists every integer with that count.
*/

package net.dinesh.unit2.lesson1;

public class Q4 {
    public static void main(String[] args) {

        int[] divisorCounts = new int[10001];
        int maximumDivisors = 0;

        for (int divisor = 1; divisor <= 10000; divisor++) {
            for (int number = divisor; number <= 10000; number += divisor) {
                divisorCounts[number]++;
            }
        }

        for (int number = 1; number <= 10000; number++) {
            if (divisorCounts[number] > maximumDivisors) {
                maximumDivisors = divisorCounts[number];
            }
        }

        System.out.println("Maximum number of divisors: " + maximumDivisors);
        System.out.print("Integers with the maximum number of divisors: ");

        for (int number = 1; number <= 10000; number++) {
            if (divisorCounts[number] == maximumDivisors) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }
}
