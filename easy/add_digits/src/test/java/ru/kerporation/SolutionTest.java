package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addDigits() {
        Solution solution = new Solution();
        assertEquals(2, solution.addDigits(38));
        assertEquals(9, solution.addDigits(9));
        assertEquals(0, solution.addDigits(0));
        assertEquals(9, solution.addDigits(18));
        assertEquals(3, solution.addDigits(39));
        assertEquals(4, solution.addDigits(40));
    }
}