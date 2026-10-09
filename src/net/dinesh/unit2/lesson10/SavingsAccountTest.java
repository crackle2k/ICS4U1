/*
Author: Dinesh Sinnathamby
Date: October 7th, 2026
Description: Tests monthly savings interest using annual rates of 4% and 5%.
*/

package net.dinesh.unit2.lesson10;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("After the first month at 4% annual interest:");
        System.out.printf("Saver 1 balance: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance: $%.2f%n", saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("After the second month at 5% annual interest:");
        System.out.printf("Saver 1 balance: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance: $%.2f%n", saver2.getSavingsBalance());
    }
}
