/*
Author: Dinesh Sinnathamby
Date: September 30th, 2026
Description: Recursively removes all spaces from a line of text.
*/

package net.dinesh.unit2.lesson5;

public class Q5 {
    public static void main(String[] args) {
        System.out.println(compact("this is a test"));
    }

    public static String compact(String line) {
        if (line.isEmpty()) {
            return "";
        }
        char first = line.charAt(0);
        String rest = compact(line.substring(1));
        return first == ' ' ? rest : first + rest;
    }
}
