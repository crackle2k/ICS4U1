/*
Author: Dinesh Sinnathamby
Date: November 8th, 2026
Description: Implements a generic first-in, first-out queue using a linked list.
*/

public class DynamicQueue<T> implements QueueADT<T> {
    private LinkedListADT<T> myList;

    public DynamicQueue() {
        myList = new LinkedList<T>();
    }

    public void enqueue(T element) {
        myList.addLast(element);
    }

    public T dequeue() {
        return myList.removeFirst();
    }

    public T peek() {
        return myList.peek();
    }

    public boolean isEmpty() {
        return myList.isEmpty();
    }

    public int size() {
        return myList.size();
    }

    public void clear() {
        myList.clear();
    }

    public String toString() {
        return myList.toString();
    }
}
