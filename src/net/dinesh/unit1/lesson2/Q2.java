/*
Author: Dinesh Sinnathamby
Date: September 10th, 2026
Description: Short program demonstrating the difference between adding integers and strings in Java.
*/

package net.dinesh.unit1.lesson2;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(1 + 1 + "1");
        System.out.println("1" + 1 + 1);
    }
}

// The output is 21 for the first print statement, and 111 for the second one.
