package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void intersection() {
        final Solution solution = new Solution();
        assertArrayEquals(new int[]{2}, solution.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{4, 9}, solution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
        assertArrayEquals(new int[]{}, solution.intersection(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{1}, solution.intersection(new int[]{1}, new int[]{1}));
        assertArrayEquals(new int[]{1, 2}, solution.intersection(new int[]{1, 2}, new int[]{1, 2}));
        assertArrayEquals(new int[]{}, solution.intersection(new int[]{}, new int[]{1, 2}));
    }
}
