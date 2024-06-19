package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchRange() {
        final Solution solution = new Solution();
        assertArrayEquals(new int[]{3, 4}, solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
        assertArrayEquals(new int[]{-1, -1}, solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
        assertArrayEquals(new int[]{-1, -1}, solution.searchRange(new int[]{2, 2}, 3));
        assertArrayEquals(new int[]{0, 1}, solution.searchRange(new int[]{2, 2}, 2));
        assertArrayEquals(new int[]{-1, -1}, solution.searchRange(new int[]{}, 0));
        assertArrayEquals(new int[]{-1, -1}, solution.searchRange(new int[]{}, 1));
    }
}