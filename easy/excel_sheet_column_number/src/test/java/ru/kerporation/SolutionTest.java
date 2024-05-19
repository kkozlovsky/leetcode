package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void titleToNumber() {
        final Solution solution = new Solution();
        assertEquals(1, solution.titleToNumber("A"));
        assertEquals(28, solution.titleToNumber("AB"));
        assertEquals(701, solution.titleToNumber("ZY"));
        assertEquals(702, solution.titleToNumber("ZZ"));
        assertEquals(703, solution.titleToNumber("AAA"));
    }
}