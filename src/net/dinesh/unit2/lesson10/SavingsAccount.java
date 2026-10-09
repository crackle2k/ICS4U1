/*
Author: Dinesh Sinnathamby
Date: October 7th, 2026
Description: Represents a savings account with a shared annual interest rate.
*/

package net.dinesh.unit2.lesson10;

public class SavingsAccount {
    private static double annualInterestRate = 0.0;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance += monthlyInterest;
    }

    // Use a decimal rate, such as 0.04 for 4%.
    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
}
