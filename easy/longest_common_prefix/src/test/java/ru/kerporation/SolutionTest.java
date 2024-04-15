package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestCommonPrefix() {
        Solution solution = new Solution();
        assertEquals("", solution.longestCommonPrefix(null));
        assertEquals("", solution.longestCommonPrefix(new String[0]));
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}