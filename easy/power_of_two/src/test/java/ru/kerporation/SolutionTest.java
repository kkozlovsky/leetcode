package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isPowerOfTwo() {
        final Solution solution = new Solution();
        assertTrue(solution.isPowerOfTwo(1));
        assertFalse(solution.isPowerOfTwo(3));
        assertTrue(solution.isPowerOfTwo(4));
        assertTrue(solution.isPowerOfTwo(16));
        assertFalse(solution.isPowerOfTwo(218));
        assertTrue(solution.isPowerOfTwo(256));
    }
}