package ru.kerporation;

import java.util.ArrayList;
import java.util.List;

class Solution {
    final List<Integer> res = new ArrayList<>();

    public List<Integer> postorderTraversal(final TreeNode root) {
        postOrder(root);
        return res;
    }

    private void postOrder(final TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        res.add(root.val);
    }
}