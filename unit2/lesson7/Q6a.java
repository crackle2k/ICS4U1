/*
Author: Dinesh Sinnathamby
Date: November 2nd, 2026
Description: Rewrites question 3 using BufferedWriter to save the random integers.
*/

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;
import javax.swing.JOptionPane;

public class Q6a {
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
                JOptionPane.showMessageDialog(null, "Enter a valid range, a positive count, and a file name.");
                return;
            }

            try (BufferedWriter output = new BufferedWriter(new FileWriter(fileName))) {
                for (int i = 0; i < count; i++) {
                    int number = (int) generator.nextLong(minimum, (long) maximum + 1);
                    output.write(Integer.toString(number));
                    output.newLine();
                }
            }
            JOptionPane.showMessageDialog(null, count + " integers written to " + fileName);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Enter an integer for each numeric value.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File error: " + e.getMessage());
        }
    }
}
