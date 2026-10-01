/*
Author: Dinesh Sinnathamby
Date: September 30th, 2026
Description: Recursively inserts hyphens between the letters of a word.
*/

package net.dinesh.unit2.lesson5;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(expand("automobile"));
        System.out.println(expand("a"));
    }

    public static String expand(String word) {
        if (word.length() <= 1) {
            return word;
        }
        return word.charAt(0) + "-" + expand(word.substring(1));
    }
}
