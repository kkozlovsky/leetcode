package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLastWord() {
        final Solution solution = new Solution();
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
        assertEquals(5, solution.lengthOfLastWord("Hello World "));
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));

        assertEquals(5, solution.lengthOfLastWord1("Hello World"));
        assertEquals(5, solution.lengthOfLastWord1("Hello World "));
        assertEquals(4, solution.lengthOfLastWord1("   fly me   to   the moon  "));
    }
}