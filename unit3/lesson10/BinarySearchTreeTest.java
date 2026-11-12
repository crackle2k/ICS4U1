/*
Author: Dinesh Sinnathamby
Date: November 11th, 2026
Description: Demonstrates searching, minimum and maximum values, and binary tree traversals.
*/

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] values = {14, 16, 17, 18, 19};

        for (int value : values) {
            tree.insert(value);
        }

        TreeNode found = tree.search(17);
        if (found != null) {
            System.out.println("Found: " + found.getValue());
        }

        TreeNode missing = tree.search(99);
        System.out.println("Search for 99: " + missing);
        System.out.print("Inorder: ");
        tree.inorderTraversal();
        System.out.print("Preorder: ");
        tree.preorderTraversal();
        System.out.print("Postorder: ");
        tree.postorderTraversal();
        System.out.print("Level order: ");
        tree.levelOrderTraversal();
    }
}
