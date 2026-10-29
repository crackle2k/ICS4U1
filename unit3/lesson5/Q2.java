/*
Author: Dinesh Sinnathamby
Date: October 27th, 2026
Description: Uses selection sort and measures its runtime for different array sizes.
*/

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        int[] sizes = {5000, 10000, 20000};
        int trials = 7;
        Random generator = new Random();

        for (int size : sizes) {
            int[] original = new int[size];
            for (int i = 0; i < original.length; i++) {
                original[i] = generator.nextInt(100000);
            }

            long total = 0;
            long fastest = Long.MAX_VALUE;
            long slowest = Long.MIN_VALUE;

            System.out.println("\nSelection sort: " + size + " numbers");
            for (int trial = 1; trial <= trials; trial++) {
                int[] data = original.clone();

                long start = System.currentTimeMillis();
                selectionSort(data);
                long end = System.currentTimeMillis();

                long elapsed = end - start;
                total += elapsed;
                fastest = Math.min(fastest, elapsed);
                slowest = Math.max(slowest, elapsed);
                System.out.println("Trial " + trial + ": " + elapsed + " ms");
            }

            double average = (double) (total - fastest - slowest) / (trials - 2);
            System.out.println("Discarded fastest: " + fastest + " ms");
            System.out.println("Discarded slowest: " + slowest + " ms");
            System.out.printf("Average of remaining five trials: %.2f ms%n", average);
        }
    }

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int smallest = i;
    
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[smallest]) {
                    smallest = j;
                }
            }

            int temp = data[i];
            data[i] = data[smallest];
            data[smallest] = temp;
        }
    }
}
