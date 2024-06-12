package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void thirdMax() {
        final Solution solution = new Solution();
        assertEquals(2, solution.thirdMax(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(2, solution.thirdMax(new int[]{2, 2, 1, 1, 1, 2, 2, 2}));
        assertEquals(1, solution.thirdMax(new int[]{3, 2, 1}));
    }
}