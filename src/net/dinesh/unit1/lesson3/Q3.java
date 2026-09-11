/*
Author: Dinesh Sinnathamby
Date: September 11th, 2026
Description: Short program featuring a simple interest calculator, displaying the amount of money you've made over a set amount of years.
*/

package net.dinesh.unit1.lesson3;

public class Q3 {
    public static void main(String[] args) {

        int initialBalance = 21000;
        int yearsPassed = 1;
        double interestRate = 0.054;
        double interestGain = initialBalance * (interestRate * yearsPassed);
        double totalBalance = initialBalance + interestGain;

        System.out.println("After " + yearsPassed + " year(s), you have made $" + interestGain + ", bringing your balance to $" + totalBalance + '!');
    }
}
