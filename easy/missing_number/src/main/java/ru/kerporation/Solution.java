package ru.kerporation;

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return expectedSum - actualSum;
    }

    public int missingNumber1(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        for (int val : nums) {
            sum -= val;
        }
        return sum;
    }
}