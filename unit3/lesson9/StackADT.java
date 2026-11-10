/*
Author: Dinesh Sinnathamby
Date: November 9th, 2026
Description: Simple abstract data type for a Stack, intended to be implemented in DynamicStack.
*/

public interface StackADT<T> {

    public void push(T element);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public int size();
    public void clear();
    public String toString();
}