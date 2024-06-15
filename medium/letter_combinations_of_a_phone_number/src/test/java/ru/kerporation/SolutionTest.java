package ru.kerporation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void letterCombinations() {
        final Solution solution = new Solution();
        assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), solution.letterCombinations("23"));
    }
}