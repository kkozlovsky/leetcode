package ru.kerporation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void combinationSum() {
        Solution solution = new Solution();
        assertEquals(List.of(List.of(2, 2, 3), List.of(7)), solution.combinationSum(new int[]{2, 3, 6, 7}, 7));
        assertEquals(List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)), solution.combinationSum(new int[]{2, 3, 5}, 8));
    }
}