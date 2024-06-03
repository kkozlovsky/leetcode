package ru.kerporation;

class Solution {
    public int countNodes(final TreeNode root) {
        return countNode(root);
    }

    private int countNode(final TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = countNode(node.left);
        int right = countNode(node.right);
        return left + right + 1;
    }
}