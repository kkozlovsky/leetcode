package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome1(121));
        assertFalse(solution.isPalindrome1(-121));
        assertFalse(solution.isPalindrome1(10));

        assertTrue(solution.isPalindrome2(121));
        assertFalse(solution.isPalindrome2(-121));
        assertFalse(solution.isPalindrome2(10));
    }
}