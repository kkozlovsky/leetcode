package ru.kerporation;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        final Set<Integer> set = new HashSet<>();
        for (int j : nums1) {
            set.add(j);
        }

        final Set<Integer> hashset = new HashSet<>();
        for (int j : nums2) {
            if (set.contains(j)) {
                hashset.add(j);
            }
        }
        final int[] arr = new int[hashset.size()];
        int x = 0;
        for (int i : hashset) {
            arr[x] = i;
            x++;
        }
        return arr;
    }
}