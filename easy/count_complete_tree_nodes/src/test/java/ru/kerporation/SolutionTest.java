package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void countNodes() {
        final Solution solution = new Solution();
        assertEquals(0, solution.countNodes(null));
        assertEquals(1, solution.countNodes(new TreeNode(1)));
        assertEquals(5, solution.countNodes(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }
}