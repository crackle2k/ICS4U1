/*
Author: Dinesh Sinnathamby
Date: November 8th, 2026
Description: Stores an element and a reference to the next node in a linked list.
*/

public class ListNode<T> {
    private T value;
    private ListNode<T> next;

    public ListNode(T value) {
        this.value = value;
        next = null;
    }

    public T getValue() {
        return value;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }
}
