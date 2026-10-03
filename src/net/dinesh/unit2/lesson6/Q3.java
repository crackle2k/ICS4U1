/*
Author: Dinesh Sinnathamby
Date: October 2nd, 2026
Description: Checks a telephone number's format and displays its three number groups.
*/

package net.dinesh.unit2.lesson6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phoneNumber;

        System.out.print("Enter a phone number in the format (123) 456-7890: ");
        phoneNumber = input.nextLine();

        while (!phoneNumber.matches("\\([1-9][0-9]{2}\\) [0-9]{3}-[0-9]{4}")) {
            System.out.print("Enter a phone number in the correct format (123) 456-7890: ");
            phoneNumber = input.nextLine();
        }

        StringTokenizer phoneParts = new StringTokenizer(phoneNumber, "()");
        String areaCode = phoneParts.nextToken();
        String firstThreeDigits = phoneParts.nextToken(") -");
        String lastFourDigits = phoneParts.nextToken();

        System.out.println(areaCode + "-" + firstThreeDigits + "-" + lastFourDigits);
    }
}
