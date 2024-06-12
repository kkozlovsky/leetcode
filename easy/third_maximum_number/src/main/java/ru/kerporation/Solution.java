package ru.kerporation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    public int thirdMax(final int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max1 > num && num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max2 > num && num > max3) {
                max3 = num;
            }
        }
        return max3 != Long.MIN_VALUE ? (int) max3 : (int) max1;
    }

    public int thirdMax1(final int[] nums) {
        final Set<Integer> set = new HashSet<>();
        for (final int num : nums) {
            set.add(num);
        }
        final int[] b = new int[set.size()];
        int i = 0;
        for (int num : set) {
            b[i++] = num;
        }
        Arrays.sort(b);
        return ((b.length >= 3) ? b[b.length - 3] : b[b.length - 1]);
    }


}