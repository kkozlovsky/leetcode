package ru.kerporation;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(final int val,
             final TreeNode left,
             final TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}