package ru.kerporation;

class Solution {
    public int[] searchRange(final int[] nums,
                             final int target) {
        int[] ans = new int[2];
        if (nums.length == 0) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    int search(final int[] nums,
               final int target,
               final boolean firstIndOrNot) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (firstIndOrNot) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}