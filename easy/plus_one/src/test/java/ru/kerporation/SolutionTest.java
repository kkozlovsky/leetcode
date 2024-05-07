package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void plusOne() {
        final Solution solution = new Solution();
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 0}, solution.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1, 0, 0}, solution.plusOne(new int[]{9, 9}));
        assertArrayEquals(new int[]{1, 0, 0, 0}, solution.plusOne(new int[]{9, 9, 9}));
    }


}