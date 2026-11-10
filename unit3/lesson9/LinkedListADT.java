/*
Author: Dinesh Sinnathamby
Date: November 9th, 2026
Description: Defines the linked-list operations needed by a dynamic stack.
*/

public interface LinkedListADT<T> {
    void addFirst(T element);
    void addLast(T element);
    T removeFirst();
    T peek();
    boolean isEmpty();
    int size();
    void clear();
    String toString();
}
