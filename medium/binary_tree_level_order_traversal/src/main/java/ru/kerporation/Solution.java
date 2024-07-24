package ru.kerporation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(final TreeNode root) {
        final Queue<TreeNode> q = new LinkedList<>();
        final List<List<Integer>> finalAns = new ArrayList<>();
        if (root == null) {
            return finalAns;
        }
        q.add(root);
        while (!q.isEmpty()) {
            int levels = q.size();
            final List<Integer> subLevels = new ArrayList<>();
            for (int i = 0; i < levels; i++) {
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }
                subLevels.add(q.remove().val);
            }
            finalAns.add(subLevels);
        }
        return finalAns;
    }
}