package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseVowels() {
        final Solution solution = new Solution();
        assertEquals("holle", solution.reverseVowels("hello"));
        assertEquals("leotcede", solution.reverseVowels("leetcode"));
    }
}