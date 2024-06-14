package ru.kerporation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void threeSum() {
        final Solution solution = new Solution();
        final List<List<Integer>> lists = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertEquals(2, lists.size());
        assertEquals(List.of(-1, -1, 2), lists.getFirst());
        assertEquals(List.of(-1, 0, 1), lists.getLast());
    }
}