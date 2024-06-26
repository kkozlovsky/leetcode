package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void maxSubArray() {
        final Solution solution = new Solution();
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, solution.maxSubArray(new int[]{1}));
        assertEquals(2, solution.maxSubArray(new int[]{1, 1}));
    }
}