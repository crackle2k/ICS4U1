/*
Author: Dinesh Sinnathamby
Date: September 10th, 2026
Description: Short program demonstrating the short primitive data type, and seeing at what values will result in an error.
*/

package net.dinesh.unit1.lesson2;

public class Q3 {
    public static void main(String[] args) {
        short num = 32767;
        System.out.println("A short: " + num);
    }
}

// Setting the value of num to be 32768 or greater, as well as -32768 or less will result in the error.