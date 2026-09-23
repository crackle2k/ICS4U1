/*
Author: Dinesh Sinnathamby
Date: September 22nd, 2026
Description: Counts the unique birthdays among 365 randomly selected people.
*/

package net.dinesh.unit2.lesson2;

public class Q3 {
    public static void main(String[] args) {
        /*
        Purpose: Runs the birthday simulation and displays the number of unique birthdays.
        Parameters: Only command line arguments are passed in, which are not used.
        Return Value: None.
        */

        System.out.println("Unique birthdays among 365 people: " + countUniqueBirthdays());
    }

    public static int countUniqueBirthdays() {
        /*
        Purpose: Counts the unique birthdays among 365 randomly selected people.
        Parameters: None.
        Return Value: The number of unique birthdays selected.
        */

        boolean[] birthdaysSeen = new boolean[365];
        int uniqueBirthdays = 0;

        for (int person = 0; person < 365; person++) {
            int birthday = (int) (Math.random() * birthdaysSeen.length);

            if (!birthdaysSeen[birthday]) {
                birthdaysSeen[birthday] = true;
                uniqueBirthdays++;
            }
        }

        return uniqueBirthdays;
    }
}
