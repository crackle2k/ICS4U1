/*
Author: Dinesh Sinnathamby
Date: November 2nd, 2026
Description: Uses dialogs to get input and write random integers to a text file.
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JOptionPane;

public class Q3 {
    public static void main(String[] args) {
        Random generator = new Random();

        try {
            String minimumInput = JOptionPane.showInputDialog("Enter the minimum integer:");
            if (minimumInput == null) {
                return;
            }
            int minimum = Integer.parseInt(minimumInput);

            String maximumInput = JOptionPane.showInputDialog("Enter the maximum integer:");
            if (maximumInput == null) {
                return;
            }
            int maximum = Integer.parseInt(maximumInput);

            String countInput = JOptionPane.showInputDialog("Enter the number of integers:");
            if (countInput == null) {
                return;
            }
            int count = Integer.parseInt(countInput);

            String fileName = JOptionPane.showInputDialog("Enter the output file name:");
            if (fileName == null) {
                return;
            }
            if (minimum > maximum || count < 1 || fileName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Enter a valid range, a positive count, and a file name.");
                return;
            }

            try (PrintWriter output = new PrintWriter(fileName)) {
                for (int i = 0; i < count; i++) {
                    int number = (int) generator.nextLong(minimum, (long) maximum + 1);
                    output.println(number);
                }
                if (output.checkError()) {
                    throw new IOException("Could not write all the integers.");
                }
            }
            JOptionPane.showMessageDialog(null, count + " integers written to " + fileName);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input. Enter an integer for each numeric value.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File error: " + e.getMessage());
        }
    }
}
