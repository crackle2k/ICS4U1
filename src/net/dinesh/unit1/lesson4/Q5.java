/*
Author: Dinesh Sinnathamby
Date: September 14th, 2026
Description: Short program requesting three integers from the user, and calculating the sum, average, and product.
*/

package net.dinesh.unit1.lesson4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int firstNumber = myScanner.nextInt();
        int secondNumber = myScanner.nextInt();
        int thirdNumber = myScanner.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int average = sum / 3;
        int product = firstNumber * secondNumber * thirdNumber;

        System.out.println("The sum is " + sum + ", the average is " + average + ", and the product is " + product + '.');
    }
}
