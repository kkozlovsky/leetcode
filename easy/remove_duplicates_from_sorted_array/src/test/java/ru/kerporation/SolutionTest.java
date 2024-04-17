package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void removeDuplicates() {
        Solution solution = new Solution();
        assertEquals(3, solution.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }
}