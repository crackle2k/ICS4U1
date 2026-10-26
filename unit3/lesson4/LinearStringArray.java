/*
Author: Dinesh Sinnathamby
Date: October 26th, 2026
Description: Performs a linear search on an array of Strings.
*/

public class LinearStringArray {
    private String[] data;

    public LinearStringArray(String[] names) {
        data = names;
    }

    public int linearSearch(String searchKey) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(searchKey)) {
                return i;
            }
        }

        return -1;
    }
}
