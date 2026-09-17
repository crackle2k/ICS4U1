/*
Author: Dinesh Sinnathamby
Date: September 16th, 2026
Description: Short program that outputs the product of all odd numbers from 1 to each inputted number, and stops the program when zero is inputted.
*/

package net.dinesh.unit1.lesson6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            long product = 1;

            for (int i = 1; i <= number; i += 2) {
                product *= i;
            }

            System.out.println(product);
        }

    }
}
