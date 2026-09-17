/*
Author: Dinesh Sinnathamby
Date: September 16th, 2026
Description: Short program that outputs the digits of each inputted number in reverse order without using a String, and stops the program when zero is inputted.
*/

package net.dinesh.unit1.lesson6;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            int reversed = 0;

            while (number > 0) {
                reversed = reversed * 10 + number % 10;
                number /= 10;
            }

            System.out.println(reversed);
        }

    }
}
