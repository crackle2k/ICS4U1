/*
Author: Dinesh Sinnathamby
Date: September 11th, 2026
Description: Short program showcasing the Math.random method in Java, and simulating a die roll.
*/

package net.dinesh.unit1.lesson3;

public class Q4 {
    public static void main(String[] args) {

        int firstDice = (int)(Math.random() * 6) + 1;
        int secondDice = (int)(Math.random() * 6) + 1;
        int totalRoll = firstDice + secondDice;

        System.out.println("Your first dice rolled " + firstDice + '!');
        System.out.println("Your second dice rolled " + secondDice + '!');
        System.out.println("Your total roll is " + totalRoll + '!');
    }
}
