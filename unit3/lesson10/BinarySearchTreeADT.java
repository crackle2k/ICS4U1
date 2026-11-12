/*
Author: Dinesh Sinnathamby
Date: November 11th, 2026
Description: Defines the operations for an integer binary search tree abstract data type.
*/

public interface BinarySearchTreeADT {
    void insert(int value);
    TreeNode search(int searchKey);
    int minValue();
    int maxValue();
    void inorderTraversal();
    void preorderTraversal();
    void postorderTraversal();
    void levelOrderTraversal();
    boolean isEmpty();
    void clear();
}
