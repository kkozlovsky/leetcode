package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isSameTree() {
        final Solution solution = new Solution();
        assertTrue(solution.isSameTree(null, null));
        assertTrue(solution.isSameTree(new TreeNode(1), new TreeNode(1)));
        assertFalse(solution.isSameTree(new TreeNode(1), new TreeNode(2)));
        assertTrue(solution.isSameTree(new TreeNode(10, new TreeNode(5), new TreeNode(20)), new TreeNode(10, new TreeNode(5), new TreeNode(20))));
        assertFalse(solution.isSameTree(new TreeNode(10, new TreeNode(5), new TreeNode(20)), new TreeNode(10, new TreeNode(5), new TreeNode(21))));
    }
}