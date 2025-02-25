package ru.kerporation;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        int oddCount = 0; // Count of characters with odd frequency
        final Map<Character, Integer> frequencyMap = new HashMap<>();

        for (final char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            if (frequencyMap.get(ch) % 2 == 0) {
                oddCount--;
            } else {
                oddCount++;
            }
        }

        if (oddCount > 1) {
            return s.length() - oddCount + 1;
        }
        return s.length();
    }
}