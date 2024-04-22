package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxDepth() {
        final Solution solution = new Solution();
        assertEquals(3, solution.maxDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        assertEquals(2, solution.maxDepth(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        assertEquals(1, solution.maxDepth(new TreeNode(1)));
        assertEquals(0, solution.maxDepth(null));
    }
}