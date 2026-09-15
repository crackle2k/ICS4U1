/*
Author: Dinesh Sinnathamby
Date: September 15th, 2026
Description: Short program that calculates the two largest numbers out of ten user inputted numbers, and outputs it.
*/

package net.dinesh.unit1.lesson5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0, largest = 0, secondLargest = 0;

        while (counter < 10) {
            int number = scanner.nextInt();
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }

            counter++;
        }

        System.out.println("The largest number is " + largest + ", and the second largest is " + secondLargest + '.');
    }
}
