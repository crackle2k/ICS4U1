/*
Author: Dinesh Sinnathamby
Date: November 2nd, 2026
Description: Rewrites question 4 using BufferedReader to read the integer file.
*/

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Q6b {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File file = chooser.getSelectedFile();
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int count = 0;

        try (BufferedReader input = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = input.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                smallest = Math.min(smallest, number);
                largest = Math.max(largest, number);
                count++;
            }

            if (count == 0) {
                JOptionPane.showMessageDialog(null, "The selected file is empty.");
            } else {
                JOptionPane.showMessageDialog(null, "Analysis of " + file.getName() + "\nIntegers read: " + count + "\nSmallest integer: " + smallest + "\nLargest integer: " + largest);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid file. Each line must contain one integer.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File error: " + e.getMessage());
        }
    }
}
