package ru.kerporation;

public class Solution {
    public boolean exist(final char[][] board,
                         final String word) {
        final int m = board.length;
        final int n = board[0].length;

        boolean[][] visited = new boolean[m][n];
        boolean result;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    result = backtrack(board, word, visited, i, j, 0);
                    if (result) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean backtrack(final char[][] board,
                              final String word,
                              final boolean[][] visited,
                              final int i,
                              final int j,
                              final int index) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }

        visited[i][j] = true;

        if (backtrack(board, word, visited, i + 1, j, index + 1) ||
                backtrack(board, word, visited, i - 1, j, index + 1) ||
                backtrack(board, word, visited, i, j + 1, index + 1) ||
                backtrack(board, word, visited, i, j - 1, index + 1)) {
            return true;
        }

        visited[i][j] = false;
        return false;
    }
}