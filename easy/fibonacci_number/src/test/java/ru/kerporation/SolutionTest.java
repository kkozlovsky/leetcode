package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void fib() {
        final Solution solution = new Solution();
        assertEquals(0, solution.fib(0));
        assertEquals(1, solution.fib(1));
        assertEquals(2, solution.fib(3));
        assertEquals(3, solution.fib(4));
    }
}