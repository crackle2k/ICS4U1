/*
Author: Dinesh Sinnathamby
Date: September 22nd, 2026
Description: Simulates random birthdays until three people share the same day of the year.
*/

package net.dinesh.unit2.lesson2;

public class Q2 {
    public static void main(String[] args) {
        /*
        Purpose: Runs the birthday simulation and displays how many people were selected.
        Parameters: Only command line arguments are passed in, which are not used.
        Return Value: None.
        */

        System.out.println("People selected until three share a birthday: " + birthDayCalculator());
    }

    public static int birthDayCalculator() {
        /*
        Purpose: Selects random birthdays until three people share the same birthday.
        Parameters: None.
        Return Value: The number of people selected.
        */

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
