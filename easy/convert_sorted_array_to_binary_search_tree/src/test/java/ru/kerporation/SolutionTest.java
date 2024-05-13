package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortedArrayToBST() {
        final Solution solution = new Solution();
        final TreeNode root = solution.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        assertEquals(0, root.val);
        assertEquals(-10, root.left.val);
        assertEquals(5, root.right.val);
        assertEquals(-3, root.left.right.val);
        assertEquals(9, root.right.right.val);
    }
}