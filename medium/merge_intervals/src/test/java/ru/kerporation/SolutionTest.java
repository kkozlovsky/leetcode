package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void merge() {
        final Solution solution = new Solution();
        assertArrayEquals(new int[][]{{1, 5}}, solution.merge(new int[][]{{1, 4}, {4, 5}}));
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }
}