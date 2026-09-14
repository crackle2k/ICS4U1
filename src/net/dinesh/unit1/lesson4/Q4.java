/*
Author: Dinesh Sinnathamby
Date: September 14th, 2026
Description: Short ad-lib program taking various pieces of information about the user and turning it in to a fun little summary of your life.
*/

package net.dinesh.unit1.lesson4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String name;
        int age;
        String city;
        String university;
        String profession;
        String animal;
        String petName;

        name = myScanner.nextLine();
        age = myScanner.nextInt();
        myScanner.nextLine();
        city  = myScanner.nextLine();
        university = myScanner.nextLine();
        profession = myScanner.nextLine();
        animal = myScanner.nextLine();
        petName = myScanner.nextLine();

        System.out.println("There was once a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name);
        System.out.println("went to university at " + university + ". " + name + " graduated and went to work at " + profession + '.');
        System.out.println("Then " + name + " adopted a(n) " + animal + " named " + petName + ". They lived happily ever after!");

    }
}
