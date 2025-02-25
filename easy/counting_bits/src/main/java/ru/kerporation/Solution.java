package ru.kerporation;

class Solution {
    public int[] countBits(final int num) {
        int[] f = new int[num + 1];
        for (int i = 1; i <= num; i++){
            f[i] = f[i >> 1] + (i & 1);
        }
        return f;
    }
}