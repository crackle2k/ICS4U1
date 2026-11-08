/*
Author: Dinesh Sinnathamby
Date: November 8th, 2026
Description: Defines the operations for a generic queue abstract data type.
*/

public interface QueueADT<T> {
    void enqueue(T element);
    T dequeue();
    T peek();
    boolean isEmpty();
    int size();
    void clear();
    String toString();
}
