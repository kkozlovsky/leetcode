package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findTheDifference() {
        final Solution solution = new Solution();
        assertEquals('e', solution.findTheDifference("abcd", "abcde"));
        assertEquals('y', solution.findTheDifference("", "y"));

        assertEquals('e', solution.findTheDifference1("abcd", "abcde"));
        assertEquals('y', solution.findTheDifference1("", "y"));
    }
}