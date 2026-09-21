/*
Author: Dinesh Sinnathamby
Date: September 21st, 2026
Description: Short program demonstrated the use of a one dimensional integer array in Java.
*/

package net.dinesh.unit2;

public class Q2 {
    public static void main(String[] args) {
        int array[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        for ( int number: array )
            total += number;

        System.out.printf( "Total of array elements: %d\n", total );
    }
}
