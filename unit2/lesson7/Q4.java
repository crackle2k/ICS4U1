/*
Author: Dinesh Sinnathamby
Date: November 2nd, 2026
Description: Selects an integer file and reports its smallest and largest values.
*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Q4 {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File file = chooser.getSelectedFile();
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int count = 0;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                int number = Integer.parseInt(input.nextLine().trim());
                smallest = Math.min(smallest, number);
                largest = Math.max(largest, number);
                count++;
            }
            if (input.ioException() != null) {
                throw input.ioException();
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
