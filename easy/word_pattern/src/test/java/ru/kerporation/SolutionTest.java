package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void wordPattern() {
        Solution solution = new Solution();
        assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
        assertFalse(solution.wordPattern("abba", "dog cat cat fish"));
        assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"));
        assertFalse(solution.wordPattern("abba", "dog dog dog dog"));
    }
}