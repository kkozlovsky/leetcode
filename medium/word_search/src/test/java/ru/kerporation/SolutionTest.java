package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void exist() {
        final Solution solution = new Solution();
        final char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        assertTrue(solution.exist(board, "ABCCED"));
        assertTrue(solution.exist(board, "SEE"));
        assertFalse(solution.exist(board, "ABCB"));
    }
}