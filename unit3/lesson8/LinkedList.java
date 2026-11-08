/*
Author: Dinesh Sinnathamby
Date: November 8th, 2026
Description: Implements a linked list with references to the first and last nodes.
*/

public class LinkedList<T> implements LinkedListADT<T> {
    private ListNode<T> first;
    private ListNode<T> last;
    private int count;

    public LinkedList() {
        first = null;
        last = null;
        count = 0;
    }

    public void addLast(T element) {
        ListNode<T> newNode = new ListNode<T>(element);

        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }

        last = newNode;
        count++;
    }

    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }

        T value = first.getValue();
        first = first.getNext();
        count--;

        if (isEmpty()) {
            last = null;
        }
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return first.getValue();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void clear() {
        first = null;
        last = null;
        count = 0;
    }

    public String toString() {
        String result = "[";
        ListNode<T> current = first;

        while (current != null) {
            result += current.getValue();
            current = current.getNext();
            if (current != null) {
                result += ", ";
            }
        }

        return result + "]";
    }
}
