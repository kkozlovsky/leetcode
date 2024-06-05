package ru.kerporation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void binaryTreePaths() {
        final Solution solution = new Solution();
        assertEquals(List.of("1->2->5", "1->3"), solution.binaryTreePaths(new TreeNode(1, new TreeNode(2, new TreeNode(5), null), new TreeNode(3, null, null))));
    }
}