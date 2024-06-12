package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countSegments() {
        final Solution solution = new Solution();
        assertEquals(5, solution.countSegments("Hello, my name is John"));
        assertEquals(0, solution.countSegments(""));
        assertEquals(0, solution.countSegments("                "));
    }
}