package ru.kerporation;

class Solution {
    public boolean isPowerOfTwo(final int n) {
        // Check if the number is zero or negative
        if (n == 0 || n < 0) {
            return false;
        }
        // Check if the number has only one set bit
        return (n & (n - 1)) == 0;
    }
}