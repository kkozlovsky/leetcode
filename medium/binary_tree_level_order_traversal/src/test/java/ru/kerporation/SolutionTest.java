package ru.kerporation;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void levelOrder() {
        final Solution solution = new Solution();
        final TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        solution.levelOrder(root);

        System.out.println( solution.levelOrder(root));
        assertTrue(CollectionUtils.isEqualCollection(List.of(List.of(3), List.of(9, 20), List.of(15, 7)), solution.levelOrder(root)));

    }
}