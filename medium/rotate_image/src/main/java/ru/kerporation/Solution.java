package ru.kerporation;

class Solution {
    public void rotate(int[][] matrix) {
        int mid = (matrix[0].length) / 2;
        int n = matrix.length;
        for (int i = 0; i < mid; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int row = n - 1 - i;
            for (int j = 0; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i + row][j + row];
                matrix[i + row][j + row] = temp;
                row--;
            }
        }
    }
}