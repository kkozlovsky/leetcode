package ru.kerporation;

public class Solution {

    public int singleNumber(final int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}