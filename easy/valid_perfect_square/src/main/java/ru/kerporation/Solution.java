package ru.kerporation;

class Solution {
    public boolean isPerfectSquare(final int num) {
        long l = 1;
        long r = num;
        while (l <= r) {
            final long mid = l + (r - l) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}