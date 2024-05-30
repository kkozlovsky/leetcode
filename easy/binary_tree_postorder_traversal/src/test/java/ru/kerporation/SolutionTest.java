package ru.kerporation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void postorderTraversal() {
        assertEquals(List.of(4, 5, 2, 6, 3, 1), new Solution().postorderTraversal(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, null, new TreeNode(6)))));
        assertEquals(List.of(1), new Solution().postorderTraversal(new TreeNode(1)));
        assertEquals(List.of(), new Solution().postorderTraversal(null));
    }
}