/*
Author: Dinesh Sinnathamby
Date: September 22nd, 2026
Description: Simulates random birthdays until three people share the same day of the year.
*/

package net.dinesh.unit2.lesson2;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("People selected until three share a birthday: " + birthDayCalculator());
    }

    public static int birthDayCalculator() {
        int[] days = new int[365];
        int peopleSelected = 0;

        while (true) {
            int birthday = (int) (Math.random() * days.length);
            days[birthday]++;
            peopleSelected++;

            if (days[birthday] == 3) {
                return peopleSelected;
            }
        }
    }
}
