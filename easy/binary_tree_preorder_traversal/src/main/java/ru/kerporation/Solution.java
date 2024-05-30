package ru.kerporation;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(final TreeNode root) {
        preOrder(root);
        return result;
    }

    private void preOrder(final TreeNode node) {
        if (node == null) {
            return;
        }

        result.add(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
}