package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isSymmetric() {
        final Solution solution = new Solution();
        assertTrue(solution.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)))));
        assertFalse(solution.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(3), new TreeNode(4)))));
    }
}