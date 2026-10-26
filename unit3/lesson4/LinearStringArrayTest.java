/*
Author: Dinesh Sinnathamby
Date: October 26th, 2026
Description: Searches ten names entered by the user using a linear search.
*/

import java.util.Scanner;

public class LinearStringArrayTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        LinearStringArray searchArray = new LinearStringArray(names);

        System.out.print("Enter a name to search for: ");
        String searchName = input.nextLine();
        int position = searchArray.linearSearch(searchName);

        if (position == -1) {
            System.out.println("The name " + searchName + " was not found.");
        } else {
            System.out.println("The name " + searchName + " was found at index " + position + ".");
        }

        input.close();
    }
}
