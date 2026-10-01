/*
Author: Dinesh Sinnathamby
Date: September 30th, 2026
Description: Recursively reverses the characters in a word.
*/

package net.dinesh.unit2.lesson5;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(reverse("automobile"));
        System.out.println(reverse("a"));
    }

    public static String reverse(String word) {
        if (word.length() <= 1) {
            return word;
        }
        return reverse(word.substring(1)) + word.charAt(0);
    }
}
