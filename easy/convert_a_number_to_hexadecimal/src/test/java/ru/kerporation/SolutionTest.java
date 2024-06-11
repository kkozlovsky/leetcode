package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void toHex() {
        Solution solution = new Solution();
        assertEquals("0", solution.toHex(0));
        assertEquals("1", solution.toHex(1));
        assertEquals("2", solution.toHex(2));
        assertEquals("3", solution.toHex(3));
        assertEquals("4", solution.toHex(4));
        assertEquals("5", solution.toHex(5));
        assertEquals("6", solution.toHex(6));
        assertEquals("7", solution.toHex(7));
        assertEquals("8", solution.toHex(8));
        assertEquals("9", solution.toHex(9));
        assertEquals("a", solution.toHex(10));
        assertEquals("b", solution.toHex(11));
        assertEquals("c", solution.toHex(12));
        assertEquals("d", solution.toHex(13));
        assertEquals("e", solution.toHex(14));
        assertEquals("ffffffff", solution.toHex(-1));
        assertEquals("1a", solution.toHex(26));
    }
}