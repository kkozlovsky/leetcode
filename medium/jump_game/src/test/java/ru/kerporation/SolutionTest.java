package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void canJump() {
        final Solution solution = new Solution();
        assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}