/*
Author: Dinesh Sinnathamby
Date: November 2nd, 2026
Description: Writes random integers within a user-selected range to a text file.
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        try {
            System.out.print("Enter the minimum integer: ");
            int minimum = Integer.parseInt(input.nextLine());
            System.out.print("Enter the maximum integer: ");
            int maximum = Integer.parseInt(input.nextLine());
            System.out.print("Enter the number of integers: ");
            int count = Integer.parseInt(input.nextLine());
            System.out.print("Enter the output file name: ");
            String fileName = input.nextLine();

            if (minimum > maximum || count < 1 || fileName.trim().isEmpty()) {
                System.out.println("Enter a valid range, a positive count, and a file name.");
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
            System.out.println(count + " integers written to " + fileName);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Enter an integer for each numeric value.");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
