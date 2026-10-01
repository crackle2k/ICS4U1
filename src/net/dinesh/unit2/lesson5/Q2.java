/*
Author: Dinesh Sinnathamby
Date: September 30th, 2026
Description: Generates and displays five sentences using randomly selected words from arrays of articles, nouns, verbs, and prepositions.
*/

package net.dinesh.unit2.lesson5;

public class Q2 {
    private static final String[] article = {"the", "a", "one", "some", "any"};
    private static final String[] noun = {"boy", "girl", "dog", "town", "car"};
    private static final String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
    private static final String[] preposition = {"to", "from", "over", "under", "on"};

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            String sentence = pick(article) + " " + pick(noun) + " " + pick(verb) + " " + pick(preposition) + " " + pick(article) + " " + pick(noun);
            sentence = Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1) + ".";
            System.out.println(sentence);
        }
    }

    private static String pick(String[] words) {
        return words[(int) (Math.random() * words.length)];
    }
}
