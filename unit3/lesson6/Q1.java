/*
Author: Dinesh Sinnathamby
Date: October 29th, 2026
Description: Uses heap sort and measures its runtime for different array sizes.
*/

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        int[] sizes = {100000, 200000, 400000};
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

            System.out.println("\nHeap sort: " + size + " numbers");
            for (int trial = 1; trial <= trials; trial++) {
                int[] data = original.clone();

                long start = System.currentTimeMillis();
                heapSort(data);
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

    public static void heapSort(int[] data) {
        buildMaxHeap(data);

        for (int heapSize = data.length; heapSize > 1; heapSize--) {
            int temp = data[0];
            data[0] = data[heapSize - 1];
            data[heapSize - 1] = temp;

            maxHeapify(data, heapSize - 1, 0);
        }
    }

    public static void buildMaxHeap(int[] data) {
        for (int i = data.length / 2 - 1; i >= 0; i--) {
            maxHeapify(data, data.length, i);
        }
    }

    public static void maxHeapify(int[] data, int heapSize, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < heapSize && data[left] > data[largest]) {
            largest = left;
        }
        if (right < heapSize && data[right] > data[largest]) {
            largest = right;
        }

        if (largest != root) {
            int temp = data[root];
            data[root] = data[largest];
            data[largest] = temp;

            maxHeapify(data, heapSize, largest);
        }
    }
}
