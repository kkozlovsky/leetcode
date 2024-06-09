package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canConstruct() {
        final Solution solution = new Solution();
        assertFalse(solution.canConstruct("a", "b"));
        assertFalse(solution.canConstruct("aa", "ab"));
        assertTrue(solution.canConstruct("aa", "aab"));
    }
}