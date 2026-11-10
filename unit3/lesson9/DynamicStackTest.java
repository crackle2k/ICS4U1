/*
Author: Dinesh Sinnathamby
Date: November 9th, 2026
Description: Tests all dynamic stack methods with integers and strings.
*/

public class DynamicStackTest {
    public static void main(String[] args) {
        DynamicStack<Integer> numbers = new DynamicStack<Integer>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        numbers.push(40);
        numbers.push(50);
        numbers.clear();

        numbers.clear();
        numbers.push(60);

        DynamicStack<String> words = new DynamicStack<String>();
        words.push("Hello");
        words.push("World");
    }
}
