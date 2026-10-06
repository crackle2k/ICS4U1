/*
Author: Dinesh Sinnathamby
Date: October 6th, 2026
Description: Tests creating, updating, and displaying a date.
*/

package net.dinesh.unit2.lesson9;

public class DateTest {
    public static void main(String[] args) {

        Date myBirthday = new Date(6, 17, 2010);
        myBirthday.displayDate();

        myBirthday.getMonth();
        myBirthday.getDay();
        myBirthday.getYear();

        myBirthday.setMonth(11);
        myBirthday.setDay(24);
        myBirthday.setYear(2012);

        myBirthday.displayDate();
    }
}
