/*
Author: Dinesh Sinnathamby
Date: November 2nd, 2026
Description: Counts digits, vowels, consonants, and other symbols in a selected text file.
*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Q5 {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File file = chooser.getSelectedFile();
        int[] totals = new int[4];
        String[] unique = {"", "", "", ""};
        String[] categories = {"numbers", "vowels", "consonants", "other symbols"};

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char character = line.charAt(i);
                    char lower = Character.toLowerCase(character);
                    int category;

                    if (character >= '0' && character <= '9') {
                        category = 0;
                    } else if ("aeiou".indexOf(lower) >= 0) {
                        category = 1;
                    } else if (lower >= 'a' && lower <= 'z') {
                        category = 2;
                    } else {
                        category = 3;
                    }

                    totals[category]++;
                    if (unique[category].indexOf(character) < 0) {
                        unique[category] += character;
                    }
                }
            }
            if (input.ioException() != null) {
                throw input.ioException();
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
            return;
        }

        String report = "Analysis of filename: " + file.getName() + "\n\n";
        for (int i = 0; i < categories.length; i++) {
            report += totals[i] + " " + categories[i] + " total, " + unique[i].length() + " unique: " + unique[i] + "\n";
        }
        System.out.print(report);

        try (PrintWriter output = new PrintWriter("report.out")) {
            output.print(report);
            if (output.checkError()) {
                throw new IOException("Could not write the report.");
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
