package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void hasPathSum() {
        final Solution solution = new Solution();
        assertFalse(solution.hasPathSum(null, 0));
        assertTrue(solution.hasPathSum(new TreeNode(10, new TreeNode(5), new TreeNode(20)), 15));
        assertTrue(solution.hasPathSum(new TreeNode(10, new TreeNode(5), new TreeNode(20)), 30));
        assertFalse(solution.hasPathSum(new TreeNode(10, new TreeNode(5), new TreeNode(20)), 31));
    }
}