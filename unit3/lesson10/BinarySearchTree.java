/*
Author: Dinesh Sinnathamby
Date: November 11th, 2026
Description: Implements a dynamic binary search tree with searching and four traversals.
*/

public class BinarySearchTree implements BinarySearchTreeADT {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        if (isEmpty()) {
            root = new TreeNode(value);
            return;
        }

        TreeNode current = root;

        while (true) {
            if (value < current.getValue()) {
                if (current.getLeft() == null) {
                    current.setLeft(new TreeNode(value));
                    return;
                }
                current = current.getLeft();
            } else if (value > current.getValue()) {
                if (current.getRight() == null) {
                    current.setRight(new TreeNode(value));
                    return;
                }
                current = current.getRight();
            } else {
                return;
            }
        }
    }

    public TreeNode search(int searchKey) {
        TreeNode current = root;

        while (current != null) {
            if (searchKey == current.getValue()) {
                return current;
            } else if (searchKey < current.getValue()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }

        return null;
    }

    public int minValue() {
        if (isEmpty()) {
            return 0;
        }

        TreeNode current = root;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current.getValue();
    }

    public int maxValue() {
        if (isEmpty()) {
            return 0;
        }

        TreeNode current = root;
        while (current.getRight() != null) {
            current = current.getRight();
        }
        return current.getValue();
    }

    public void inorderTraversal() {
        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.getLeft());
            System.out.print(node.getValue() + " ");
            inorderTraversal(node.getRight());
        }
    }

    public void preorderTraversal() {
        preorderTraversal(root);
        System.out.println();
    }

    private void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.getValue() + " ");
            preorderTraversal(node.getLeft());
            preorderTraversal(node.getRight());
        }
    }

    public void postorderTraversal() {
        postorderTraversal(root);
        System.out.println();
    }

    private void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.getLeft());
            postorderTraversal(node.getRight());
            System.out.print(node.getValue() + " ");
        }
    }

    public void levelOrderTraversal() {
        DynamicQueue<TreeNode> nodes = new DynamicQueue<TreeNode>();

        if (!isEmpty()) {
            nodes.enqueue(root);
        }

        while (!nodes.isEmpty()) {
            TreeNode current = nodes.dequeue();
            System.out.print(current.getValue() + " ");

            if (current.getLeft() != null) {
                nodes.enqueue(current.getLeft());
            }
            if (current.getRight() != null) {
                nodes.enqueue(current.getRight());
            }
        }

        System.out.println();
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        root = null;
    }
}
