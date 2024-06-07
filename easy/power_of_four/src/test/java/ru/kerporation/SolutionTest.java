package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPowerOfFour() {
        final Solution solution = new Solution();
        assertTrue(solution.isPowerOfFour(16));
        assertFalse(solution.isPowerOfFour(5));
        assertFalse(solution.isPowerOfFour(0));
        assertFalse(solution.isPowerOfFour(-1));
        assertTrue(solution.isPowerOfFour(4));
        assertFalse(solution.isPowerOfFour(3));
        assertFalse(solution.isPowerOfFour(2));
        assertTrue(solution.isPowerOfFour(1));
        assertFalse(solution.isPowerOfFour(15));
        assertFalse(solution.isPowerOfFour(14));
        assertFalse(solution.isPowerOfFour(13));
        assertFalse(solution.isPowerOfFour(12));
        assertFalse(solution.isPowerOfFour(11));
        assertFalse(solution.isPowerOfFour(10));
        assertFalse(solution.isPowerOfFour(9));
    }
}