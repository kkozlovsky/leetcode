package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isAnagram() {
        final Solution solution = new Solution();
        assertTrue(solution.isAnagram("anagram", "nagaram"));
        assertFalse(solution.isAnagram("rat", "car"));
        assertFalse(solution.isAnagram("anagram", "nagar"));
        assertFalse(solution.isAnagram("rat", "cara"));
    }
}