/*
Author: Dinesh Sinnathamby
Date: November 8th, 2026
Description: Defines the linked-list operations needed by a dynamic queue.
*/

public interface LinkedListADT<T> {
    void addLast(T element);
    T removeFirst();
    T peek();
    boolean isEmpty();
    int size();
    void clear();
    String toString();
}
