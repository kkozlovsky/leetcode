package ru.kerporation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void getRow() {
        final Solution solution = new Solution();
        assertEquals(List.of(1), solution.getRow(0));
        assertEquals(List.of(1, 1), solution.getRow(1));
        assertEquals(List.of(1, 3, 3, 1), solution.getRow(3));
    }
}