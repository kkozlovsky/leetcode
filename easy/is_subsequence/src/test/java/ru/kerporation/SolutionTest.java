package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isSubsequence() {
        final Solution solution = new Solution();
        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }
}