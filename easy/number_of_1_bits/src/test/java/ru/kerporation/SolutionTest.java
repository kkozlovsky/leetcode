package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hammingWeight() {
        final Solution solution = new Solution();
        assertEquals(3, solution.hammingWeight(11));
        assertEquals(1, solution.hammingWeight(128));
        assertEquals(30, solution.hammingWeight(2147483645));
    }
}