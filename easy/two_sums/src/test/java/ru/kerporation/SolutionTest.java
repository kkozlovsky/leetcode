package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum1() {
        Solution solution = new Solution();
        int[] result = solution.twoSum1(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void twoSum2() {
        Solution solution = new Solution();
        int[] result = solution.twoSum2(new int[]{2, 7, 11, 15}, 26);
        assertArrayEquals(new int[]{2, 3}, result);
    }
}