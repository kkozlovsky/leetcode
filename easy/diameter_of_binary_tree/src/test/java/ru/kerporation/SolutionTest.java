package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void diameterOfBinaryTree() {
        final Solution solution = new Solution();
        assertEquals(2, solution.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        assertEquals(4, solution.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)))));
        assertEquals(5, solution.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7, new TreeNode(8), new TreeNode(9))))));
        assertEquals(6, solution.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7, new TreeNode(8), new TreeNode(9, new TreeNode(10), new TreeNode(11)))))));
    }
}