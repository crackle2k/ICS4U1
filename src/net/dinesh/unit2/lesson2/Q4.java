/*
Author: Dinesh Sinnathamby
Date: September 22nd, 2026
Description: Simulates how many people are needed to represent all 365 birthdays and averages repeated trials.
*/

package net.dinesh.unit2.lesson2;

public class Q4 {
    public static void main(String[] args) {
        /*
        Purpose: Runs the birthday simulations and displays the results of one trial and the average.
        Parameters: Only command line arguments are passed in, which are not used.
        Return Value: None.
        */

        int trials = 1000;

        System.out.println("People selected to see all 365 birthdays: " + countPeopleForAllBirthdays());
        System.out.println("Average over " + trials + " trials: " + averagePeopleForAllBirthdays(trials));
    }

    public static int countPeopleForAllBirthdays() {
        /*
        Purpose: Selects random birthdays until every day of the year has been seen.
        Parameters: None.
        Return Value: The number of people selected.
        */

        boolean[] birthdaysSeen = new boolean[365];
        int uniqueBirthdays = 0;
        int peopleSelected = 0;

        while (uniqueBirthdays < birthdaysSeen.length) {
            int birthday = (int) (Math.random() * birthdaysSeen.length);
            peopleSelected++;

            if (!birthdaysSeen[birthday]) {
                birthdaysSeen[birthday] = true;
                uniqueBirthdays++;
            }
        }

        return peopleSelected;
    }

    public static double averagePeopleForAllBirthdays(int trials) {
        /*
        Purpose: Finds the average number of people needed to see every birthday across multiple trials.
        Parameters: trials (The number of simulations to run).
        Return Value: The average number of people selected.
        */

        long totalPeopleSelected = 0;

        for (int trial = 0; trial < trials; trial++) {
            totalPeopleSelected += countPeopleForAllBirthdays();
        }

        return (double) totalPeopleSelected / trials;
    }
}
