package ru.kerporation;

public class Solution {

    int diameter;

    public int diameterOfBinaryTree(final TreeNode root) {
        diameter = 0;
        helper(root);
        return diameter;
    }

    private int helper(final TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = helper(root.left);
        int right = helper(root.right);
        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }
}