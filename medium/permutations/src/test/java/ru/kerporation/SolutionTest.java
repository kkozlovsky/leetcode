package ru.kerporation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void permute() {
        Solution solution = new Solution();
        assertEquals(List.of(List.of(0, 1), List.of(1, 0)), solution.permute(new int[]{0, 1}));
    }
}