/*
Author: Dinesh Sinnathamby
Date: October 25th, 2026
Description: Demonstrates recursive and iterative binary searches on a sorted array of random integers.
*/

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {


    private int[] data;

    public BinarySearch( int size ) {

        data = new int[ size ];
        Random generator = new Random();

        for ( int i = 0; i < size; i++ ) {
            data[i] = 10 + generator.nextInt( 90 );
        }
        Arrays.sort( data );
    }

    public int recursiveBinarySearch( int searchKey ) {
        return recursiveBinarySearch( searchKey, 0, data.length -1 );
    }

    private int recursiveBinarySearch( int searchKey, int low, int high ) {

        if (low > high) {
            return -1;
        }
        int middle = ( low + high ) / 2;

        System.out.print( searchProgress( low, middle, high ) );

        if (searchKey == data[middle]) {
            return middle;
        }

        else if (searchKey < data[middle]) {
            return recursiveBinarySearch( searchKey, low, middle - 1 );
        }

        else {
            return recursiveBinarySearch( searchKey, middle + 1, high );
        }
    }

    public int binarySearch( int searchKey ) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            System.out.print( searchProgress( low, middle, high ) );

            if (searchKey == data[middle]) {
                return middle;
            }
            else if (searchKey < data[middle]) {
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
        }

        return -1;
    }

    private String searchProgress( int low, int middle, int high ) {
        String result = "";

        for ( int i = 0; i < low; i++ ) { result += " "; }

        for ( int i = low; i <= high; i++ ) { result += data[ i ] + " "; }

        result += "\n";
        for ( int i = 0; i < middle; i++ ) { result += " "; }

        result += "*\n";
        return result;
    }

    public String toString() {
        return searchProgress( 0, (data.length - 1) / 2, data.length - 1 );
    }
}
