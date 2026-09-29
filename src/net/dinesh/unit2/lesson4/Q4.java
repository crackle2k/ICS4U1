/*
Author: Dinesh Sinnathamby
Date: September 29th, 2026
Description: Demonstrates string processing methods including validation,
              counting, reversing, palindrome checks, and substring handling.
*/

package net.dinesh.unit2.lesson4;

public class Q4 {
    public static void main(String[] args) {
        String sample = "Hello 12";
        System.out.println("Only letters: " + isOnlyLetters("Hello"));
        System.out.println("Character count: " + countChars('l', sample));
        System.out.println("Reversed: " + reverseString("Hello"));
        System.out.println("Palindrome: " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("Sum: " + addEmUp("2.3 14.77 2.71"));
        System.out.println("Unique letters: " + uniqueLetters("abcaBc"));
        System.out.println("First HTML tag: " + findFirstHTMLTag("Hello <b>world</b>"));
        System.out.println("After removing substring: " + removeSubstring("Hello world", " world"));
    }

    public static boolean isOnlyLetters( String str ) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                return false;
            }
        }
        return true;
    }

    public static int countChars( char ch, String str ) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString( String str ) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome( String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(reverseString(cleaned));
    }

    public static double addEmUp( String str) {
        if (str.trim().isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        String[] numbers = str.trim().split("\\s+");
        for (String number : numbers) {
            sum += Double.parseDouble(number);
        }
        return sum;
    }

    public static int uniqueLetters( String str) {
        boolean[] seen = new boolean[26];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z' && !seen[ch - 'a']) {
                seen[ch - 'a'] = true;
                count++;
            }
        }
        return count;
    }

    private static String findFirstHTMLTag(String text) {
        int opening = text.indexOf('<');
        if (opening == -1) {
            return null;
        }
        int closing = text.indexOf('>', opening + 1);
        if (closing == -1) {
            return null;
        }
        return text.substring(opening, closing + 1);
    }

    private static String removeSubstring(String text, String str) {
        int index = text.indexOf(str);
        if (index == -1) {
            return text;
        }
        return text.substring(0, index) + text.substring(index + str.length());
    }
}
