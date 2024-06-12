package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addStrings() {
        final Solution solution = new Solution();
        assertEquals("0", solution.addStrings("0", "0"));
        assertEquals("1", solution.addStrings("0", "1"));
        assertEquals("533", solution.addStrings("456", "77"));

    }
}