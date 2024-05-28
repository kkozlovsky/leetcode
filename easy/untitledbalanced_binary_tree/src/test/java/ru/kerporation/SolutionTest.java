package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isBalanced() {
        final Solution solution = new Solution();
        assertTrue(solution.isBalanced(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        assertTrue(solution.isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(2), new TreeNode(3, new TreeNode(3), new TreeNode(3))), new TreeNode(2, null, new TreeNode(3)))));
    }
}