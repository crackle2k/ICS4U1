/*
Author: Dinesh Sinnathamby
Date: September 21st, 2026
Description: Stores ten unique numbers between 1 and 100 in an array, ignoring out-of-range and duplicate entries.
*/

package net.dinesh.unit2.lesson1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] stored = new int[10];
        int count = 0;

        System.out.println("Please enter 10 unique numbers between 1 and 100.");

        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int number = input.nextInt();

            if (number < 1 || number > 100) {
                System.out.println("Invalid range. Please try again (1-100).");
                continue;
            }

            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (stored[i] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                System.out.println("That number has already been entered. Try a different number.");
            } else {
                stored[count] = number;
                count++;
            }
        }

        System.out.println("\nYou have entered ten unique numbers:");
        for (int i = 0; i < stored.length; i++) {
            System.out.print(stored[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
