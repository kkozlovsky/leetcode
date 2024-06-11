package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindrome() {
        final Solution solution = new Solution();
        assertEquals(1, solution.longestPalindrome("a"));
        assertEquals(7, solution.longestPalindrome("abccccdd"));
    }
}