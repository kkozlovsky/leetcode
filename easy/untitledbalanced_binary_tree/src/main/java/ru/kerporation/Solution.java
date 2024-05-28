package ru.kerporation;

class Solution {
    public boolean isBalanced(final TreeNode root) {
        // If the tree is empty, we can say it’s balanced...
        if (root == null) {
            return true;
        }
        // Height Function will return -1, when it’s an unbalanced tree...
        if (height(root) == -1) {
            return false;
        }
        return true;
    }

    // Create a function to return the “height” of a current subtree using recursion...
    public int height(final TreeNode root) {
        // Base case...
        if (root == null) {
            return 0;
        }
        // Height of left subtree...
        int leftHeight = height(root.left);
        // Height of height subtree...
        int rightHeight = height(root.right);
        // In case of left subtree or right subtree unbalanced, return -1...
        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }
        // If their heights differ by more than ‘1’, return -1...
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        // Otherwise, return the height of this subtree as max(leftHeight, rightHight) + 1...
        return Math.max(leftHeight, rightHeight) + 1;
    }
}