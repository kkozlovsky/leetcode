package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void intersect() {
        final Solution solution = new Solution();
        assertArrayEquals(new int[]{2, 2}, solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{4, 9}, solution.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
        assertArrayEquals(new int[]{}, solution.intersect(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{1}, solution.intersect(new int[]{1}, new int[]{1}));
        assertArrayEquals(new int[]{1, 2}, solution.intersect(new int[]{1, 2}, new int[]{1, 2}));
        assertArrayEquals(new int[]{}, solution.intersect(new int[]{}, new int[]{1, 2}));
    }
}