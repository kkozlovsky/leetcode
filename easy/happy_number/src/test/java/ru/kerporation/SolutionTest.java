package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isHappy() {
        final Solution solution = new Solution();
        assertTrue(solution.isHappy(19));
        assertFalse(solution.isHappy(2));
    }
}