package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void convertToTitle() {
        final Solution solution = new Solution();
        assertEquals("A", solution.convertToTitle(1));
        assertEquals("Z", solution.convertToTitle(26));
        assertEquals("AA", solution.convertToTitle(27));
        assertEquals("AB", solution.convertToTitle(28));
        assertEquals("AZ", solution.convertToTitle(52));
        assertEquals("BA", solution.convertToTitle(53));
        assertEquals("ZZ", solution.convertToTitle(702));
        assertEquals("AAA", solution.convertToTitle(703));
        assertEquals("AAB", solution.convertToTitle(704));
        assertEquals("AAY", solution.convertToTitle(727));
        assertEquals("AAZ", solution.convertToTitle(728));
        assertEquals("ZZZ", solution.convertToTitle(18278));
        assertEquals("AAAA", solution.convertToTitle(18279));
    }
}