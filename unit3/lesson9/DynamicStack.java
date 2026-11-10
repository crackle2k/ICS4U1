/*
Author: Dinesh Sinnathamby
Date: November 9th, 2026
Description: Implements a generic last-in, first-out stack using a linked list.
*/

public class DynamicStack<T> implements StackADT<T> {
    private LinkedListADT<T> myList;

    public DynamicStack() {
        myList = new LinkedList<T>();
    }

    public void push(T element) {
        myList.addFirst(element);
    }

    public T pop() {
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
