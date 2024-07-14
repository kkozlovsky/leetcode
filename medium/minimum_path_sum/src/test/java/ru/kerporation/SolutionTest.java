package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void minPathSum() {
        final Solution solution = new Solution();
        int[][] grid1 = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertEquals(7, solution.minPathSum(grid1));

        int[][] grid2 = {{1, 2, 3}, {4, 5, 6}};
        assertEquals(12, solution.minPathSum(grid2));
    }
}