package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPerfectSquare() {
        final Solution solution = new Solution();
        assertTrue(solution.isPerfectSquare(16));
        assertFalse(solution.isPerfectSquare(14));
        assertTrue(solution.isPerfectSquare(1));
        assertFalse(solution.isPerfectSquare(0));
        assertFalse(solution.isPerfectSquare(-1));
        assertFalse(solution.isPerfectSquare(2147483647));
        assertTrue(solution.isPerfectSquare(256));
    }
}