/*
Author: Dinesh Sinnathamby
Date: November 8th, 2026
Description: Searches and inserts key values in an linked list.
*/

public class OrderedList<T extends Comparable<T>> {
    private ListNode<T> first;

    public OrderedList() {
        first = null;
    }

    public ListNode<T> search(T key) {
        ListNode<T> current = first;

        while (current != null && current.getValue().compareTo(key) < 0) {
            current = current.getNext();
        }

        if (current != null && current.getValue().compareTo(key) == 0) {
            return current;
        }
        return null;
    }

    public void insert(T key) {
        ListNode<T> newNode = new ListNode<T>(key);

        if (first == null || key.compareTo(first.getValue()) <= 0) {
            newNode.setNext(first);
            first = newNode;
            return;
        }

        ListNode<T> current = first;
        while (current.getNext() != null && current.getNext().getValue().compareTo(key) < 0) {
            current = current.getNext();
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);
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
