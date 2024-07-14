package ru.kerporation;

class Solution {
    public int minPathSum(final int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        return find(grid, m - 1, n - 1, dp);
    }

    private int find(final int[][] grid,
                     final int m,
                     final int n,
                     final int[][] dp) {
        if (m == 0 && n == 0) {
            return grid[m][n];
        } else if (m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        } else if (dp[m][n] != 0) {
            return dp[m][n];
        }
        return dp[m][n] = grid[m][n] + Math.min(find(grid, m - 1, n, dp), find(grid, m, n - 1, dp));
    }
}