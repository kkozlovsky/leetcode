package ru.kerporation;

import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(final int[] nums) {
        final HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, 1);
        }
        return false;
    }
}