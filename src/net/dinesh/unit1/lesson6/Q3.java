/*
Author: Dinesh Sinnathamby
Date: September 16th, 2026
Description: Short program that calculates the factorial of an inputted number, and stops the program when zero is inputted.
*/

package net.dinesh.unit1.lesson6;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            long result = 1;

            for (int i = 1; i <= number; i++) {
                result *= i;
            }

            System.out.println(result);
        }

    }
}
