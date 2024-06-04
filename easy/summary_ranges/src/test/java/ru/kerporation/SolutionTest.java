package ru.kerporation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void summaryRanges() {
        final Solution solution = new Solution();
        assertEquals(List.of("0->2", "4->5", "7"), solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        assertEquals(List.of("0","2->4","6","8->9"), solution.summaryRanges(new int[]{0,2,3,4,6,8,9}));
        assertEquals(List.of("0"), solution.summaryRanges(new int[]{0}));
        assertEquals(List.of(), solution.summaryRanges(new int[]{}));
    }
}