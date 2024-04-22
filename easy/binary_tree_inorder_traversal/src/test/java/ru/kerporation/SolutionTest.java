package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void inorderTraversal() {
        final Solution solution = new Solution();
        final TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        final var result = solution.inorderTraversal(root);
        assertEquals(3, result.size());
    }
}