package ru.kerporation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void preorderTraversal() {
        assertEquals(List.of(1, 2, 4, 5, 3, 6), new Solution().preorderTraversal(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, null, new TreeNode(6)))));
        assertEquals(List.of(1), new Solution().preorderTraversal(new TreeNode(1)));
        assertEquals(List.of(), new Solution().preorderTraversal(null));
    }
}