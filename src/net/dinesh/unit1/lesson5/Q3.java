/*
Author: Dinesh Sinnathamby
Date: September 15th, 2026
Description: Short program that gives you coin change for an amount less than a dollar.
*/

package net.dinesh.unit1.lesson5;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userMoney = scanner.nextInt();

        if (userMoney <= 0 || userMoney >= 100) {
            System.out.println("You must input a valid amount!");
            return;
        }

        int initial = userMoney;
        int quarters = userMoney / 25;
        userMoney %= 25;

        int dimes = userMoney / 10;
        userMoney %= 10;

        int nickels = userMoney / 5;
        userMoney %= 5;

        int cents = userMoney;

        System.out.println(initial + " cents requires " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel, and " + cents + " cent(s).");
    }
}
