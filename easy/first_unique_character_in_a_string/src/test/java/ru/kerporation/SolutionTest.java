package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void firstUniqChar() {
        final Solution solution = new Solution();
        assertEquals(0, solution.firstUniqChar("leetcode"));
        assertEquals(2, solution.firstUniqChar("loveleetcode"));
        assertEquals(-1, solution.firstUniqChar("aabb"));
        assertEquals(-1, solution.firstUniqChar(""));
        assertEquals(0, solution.firstUniqChar("a"));
    }
}