package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void missingNumber() {
        final Solution solution = new Solution();
        assertEquals(2, solution.missingNumber(new int[]{3, 0, 1}));
        assertEquals(2, solution.missingNumber(new int[]{0, 1}));
        assertEquals(3, solution.missingNumber(new int[]{0, 1, 2}));
        assertEquals(4, solution.missingNumber(new int[]{0, 1, 2, 3}));
        assertEquals(5, solution.missingNumber(new int[]{0, 1, 2, 3, 4}));
        assertEquals(6, solution.missingNumber(new int[]{0, 1, 2, 3, 4, 5}));
    }
}