/*
Author: Dinesh Sinnathamby
Date: September 15th, 2026
Description: Short program calculating the next prime number following the number that the user inputted.
*/

package net.dinesh.unit1.lesson5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        int currentNumber = userNumber + 1;
        boolean foundPrime = false;

        while (!foundPrime) {

            if (currentNumber <= 1) {
                currentNumber++;
                continue;
            }

            boolean isPrime = true;
            int divisor = 2;

            while (divisor * divisor <= currentNumber) {
                if (currentNumber % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }

            if (isPrime) {
                foundPrime = true;
            } else {
                currentNumber++;
            }
        }

        System.out.println("The next prime number is " + currentNumber + '.');
    }
}
