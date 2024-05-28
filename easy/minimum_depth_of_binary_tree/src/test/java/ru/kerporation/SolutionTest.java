package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minDepth() {
        final Solution solution = new Solution();
        assertEquals(2, solution.minDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        assertEquals(2, solution.minDepth(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        assertEquals(1, solution.minDepth(new TreeNode(1)));
    }
}