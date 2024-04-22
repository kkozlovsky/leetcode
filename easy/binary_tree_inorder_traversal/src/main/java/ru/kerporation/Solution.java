package ru.kerporation;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    final List <Integer> ls = new ArrayList<>();

    public List<Integer> inorderTraversal(final TreeNode root) {

        if(root == null) {
            return List.of();
        }

        inorderTraversal(root.left);
        ls.add(root.val);
        inorderTraversal(root.right);
        return ls;
    }
}


