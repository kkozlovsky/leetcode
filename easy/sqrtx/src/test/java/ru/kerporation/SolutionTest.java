package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mySqrt() {
        final Solution solution = new Solution();
        assertEquals(1, solution.mySqrt(1));
        assertEquals(2, solution.mySqrt(4));
        assertEquals(3, solution.mySqrt(9));
        assertEquals(4, solution.mySqrt(16));
    }
}