package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void strStr() {
        final Solution solution = new Solution();
        assertEquals(2, solution.strStr("hello", "ll"));
        assertEquals(-1, solution.strStr("aaaaa", "bba"));
        assertEquals(-1, solution.strStr("", ""));
        assertEquals(-1, solution.strStr("", "a"));
    }
}