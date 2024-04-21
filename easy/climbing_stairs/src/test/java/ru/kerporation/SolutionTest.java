package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void climbStairs() {
        final Solution solution = new Solution();
        assertEquals(2, solution.climbStairs(2));
        assertEquals(3, solution.climbStairs(3));
        assertEquals(5, solution.climbStairs(4));
    }

    @Test
    void climbStairsTimeLimitExceeded() {
        final Solution solution = new Solution();
        assertEquals(2, solution.climbStairsTimeLimitExceeded(2));
        assertEquals(3, solution.climbStairsTimeLimitExceeded(3));
        assertEquals(5, solution.climbStairsTimeLimitExceeded(4));
    }
}