package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isPowerOfThree() {
        final Solution solution = new Solution();
        assertTrue(solution.isPowerOfThree(27));
        assertFalse(solution.isPowerOfThree(0));
        assertFalse(solution.isPowerOfThree(-1));
        assertTrue(solution.isPowerOfThree(9));
        assertFalse(solution.isPowerOfThree(45));
    }
}