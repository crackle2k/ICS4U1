/*
Author: Dinesh Sinnathamby
Date: November 5th, 2026
Description: Implements a generic first-in, first-out queue using a fixed-size array.
*/

public class StaticQueue<T> implements QueueADT<T> {
    private final T[] elements;
    private int count;

    public StaticQueue(int capacity) {
        elements = (T[]) new Object[Math.max(0, capacity)];
        count = 0;
    }

    public void enqueue(T element) {
        if (count == elements.length) {
            return;
        }
        elements[count] = element;
        count++;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }

        T first = elements[0];
        for (int i = 1; i < count; i++) {
            elements[i - 1] = elements[i];
        }
        count--;
        elements[count] = null;
        return first;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return elements[0];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(elements[i]);
        }
        result.append("]");
        return result.toString();
    }
}
