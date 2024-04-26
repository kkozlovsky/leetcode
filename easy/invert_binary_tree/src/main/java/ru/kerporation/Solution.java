package ru.kerporation;

public class Solution {

    public TreeNode invertTree(final TreeNode root) {
        if (root == null) {
            return null;
        }
        final TreeNode left = invertTree(root.left);
        final TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}