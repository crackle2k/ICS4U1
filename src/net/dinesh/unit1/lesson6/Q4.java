/*
Author: Dinesh Sinnathamby
Date: September 16th, 2026
Description: Short program that outputs the number of divisors of each inputted number, and stops the program when zero is inputted.
*/

package net.dinesh.unit1.lesson6;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            int divisors = 0;

            for (int divisor = 1; divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    divisors++;
                }
            }

            System.out.println(divisors);
        }

    }
}
