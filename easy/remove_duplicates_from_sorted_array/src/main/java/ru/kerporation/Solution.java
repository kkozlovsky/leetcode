package ru.kerporation;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[count] != nums[i]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }
}