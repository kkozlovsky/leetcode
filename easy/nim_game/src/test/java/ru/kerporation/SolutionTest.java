package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canWinNim() {
        Solution solution = new Solution();
        assertTrue(solution.canWinNim(1));
        assertTrue(solution.canWinNim(2));
        assertFalse(solution.canWinNim(4));
    }
}