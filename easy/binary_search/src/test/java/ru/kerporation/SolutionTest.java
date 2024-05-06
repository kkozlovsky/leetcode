package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void search() {
        final Solution solution = new Solution();
        assertEquals(1, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 0));
        assertEquals(5, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 12));
        assertEquals(-1, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 8));
        assertEquals(0, solution.search(new int[]{1}, 1));
    }
}