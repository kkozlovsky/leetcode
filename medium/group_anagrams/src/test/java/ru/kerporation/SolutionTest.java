package ru.kerporation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void groupAnagrams() {
        final Solution solution = new Solution();
        assertEquals(List.of(List.of("eat", "tea", "ate"), List.of("tan", "nat"), List.of("bat")), solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        assertEquals(List.of(List.of("a")), solution.groupAnagrams(new String[]{"a"}));
        assertEquals(List.of(List.of("")), solution.groupAnagrams(new String[]{""}));
    }
}