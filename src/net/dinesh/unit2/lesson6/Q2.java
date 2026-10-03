/*
Author: Dinesh Sinnathamby
Date: October 2nd, 2026
Description: Converts an English phrase into pig Latin using a StringTokenizer.
*/

package net.dinesh.unit2.lesson6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine();
        StringTokenizer words = new StringTokenizer(phrase);
        String pigLatinPhrase = "";

        while (words.hasMoreTokens()) {
            String word = words.nextToken();
            pigLatinPhrase += word.substring(1) + word.charAt(0) + "ay";
            if (words.hasMoreTokens()) {
                pigLatinPhrase += " ";
            }
        }

        System.out.println(pigLatinPhrase);
    }
}
