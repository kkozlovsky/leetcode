package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void majorityElement1() {
        final Solution solution = new Solution();
        assertEquals(2, solution.majorityElement1(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(2, solution.majorityElement1(new int[]{2, 2, 1, 1, 1, 2, 2, 2}));
        assertEquals(1, solution.majorityElement1(new int[]{1}));
        assertEquals(1, solution.majorityElement1(new int[]{1, 1}));
        assertEquals(1, solution.majorityElement1(new int[]{1, 1, 1}));
        assertEquals(1, solution.majorityElement1(new int[]{1, 1, 1, 1}));
        assertEquals(1, solution.majorityElement1(new int[]{1, 1, 1, 1, 1}));

        assertEquals(2, solution.majorityElement2(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(2, solution.majorityElement2(new int[]{2, 2, 1, 1, 1, 2, 2, 2}));
        assertEquals(1, solution.majorityElement2(new int[]{1}));
        assertEquals(1, solution.majorityElement2(new int[]{1, 1}));
        assertEquals(1, solution.majorityElement2(new int[]{1, 1, 1}));
        assertEquals(1, solution.majorityElement2(new int[]{1, 1, 1, 1}));
        assertEquals(1, solution.majorityElement2(new int[]{1, 1, 1, 1, 1}));

        assertEquals(2, solution.majorityElement3(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(2, solution.majorityElement3(new int[]{2, 2, 1, 1, 1, 2, 2, 2}));
        assertEquals(1, solution.majorityElement3(new int[]{1}));
        assertEquals(1, solution.majorityElement3(new int[]{1, 1}));
        assertEquals(1, solution.majorityElement3(new int[]{1, 1, 1}));
        assertEquals(1, solution.majorityElement3(new int[]{1, 1, 1, 1}));
        assertEquals(1, solution.majorityElement3(new int[]{1, 1, 1, 1, 1}));
    }
}