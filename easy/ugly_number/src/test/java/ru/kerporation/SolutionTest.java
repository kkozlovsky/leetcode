package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isUgly() {
        final Solution solution = new Solution();
        assertTrue(solution.isUgly(6));
        assertTrue(solution.isUgly(8));
        assertFalse(solution.isUgly(14));
        assertTrue(solution.isUgly(15));
        assertFalse(solution.isUgly(21));
        assertFalse(solution.isUgly(22));
        assertTrue(solution.isUgly(24));
    }
}