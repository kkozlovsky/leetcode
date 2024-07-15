package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minDistance() {
        final Solution solution = new Solution();
        assertEquals(2, solution.minDistance("sea", "eat"));
        assertEquals(4, solution.minDistance("leetcode", "etco"));
        assertEquals(0, solution.minDistance("lee", "lee"));
        assertEquals(3, solution.minDistance("horse", "ros"));
        assertEquals(5, solution.minDistance("intention", "execution"));
    }
}