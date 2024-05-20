package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseBits() {
        final Solution solution = new Solution();
        assertEquals(964176192, solution.reverseBits(0b00000010100101000001111010011100));
    }
}