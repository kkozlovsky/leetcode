package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void invertTree() {
        final Solution solution = new Solution();
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode expected = new TreeNode(4, new TreeNode(7, new TreeNode(9), new TreeNode(6)), new TreeNode(2, new TreeNode(3), new TreeNode(1)));
        TreeNode actual = solution.invertTree(root);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.left.val, actual.left.val);
        assertEquals(expected.right.val, actual.right.val);
        assertEquals(expected.left.left.val, actual.left.left.val);
        assertEquals(expected.left.right.val, actual.left.right.val);
        assertEquals(expected.right.left.val, actual.right.left.val);
        assertEquals(expected.right.right.val, actual.right.right.val);
        assertNull(actual.left.left.left);
        assertNull(actual.left.left.right);
        assertNull(actual.left.right.left);
        assertNull(actual.left.right.right);
        assertNull(actual.right.left.left);
        assertNull(actual.right.left.right);
        assertNull(actual.right.right.left);
    }
}