package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchInsert() {
        final Solution solution = new Solution();
        assertEquals(2, solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, solution.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, solution.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, solution.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}