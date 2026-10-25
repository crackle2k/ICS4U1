/*
Author: Dinesh Sinnathamby
Date: October 23rd, 2026
Description: Simple program demonstrating a recursive linear search in Java, utilising an index variable passed between calls.
*/

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        
        int[] data = {5, 1, 3, 7, 8};
        int result = recursiveLinearSearch(data, 0, 7);
        System.out.println("Found at index " + result);
    }
    
    public static int recursiveLinearSearch(int[] data, int index, int target) {
        if (data.length == 0) { return - 1; }

        if (data[index] == target) {
            return index;
        } else {
            return recursiveLinearSearch(data, index + 1, target);
        }
    }

}
