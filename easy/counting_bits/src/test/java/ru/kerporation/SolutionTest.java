package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countBits() {
        final Solution solution = new Solution();
        assertArrayEquals(new int[]{0, 1, 1}, solution.countBits(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, solution.countBits(5));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4}, solution.countBits(15));
    }
}