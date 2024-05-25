package ru.kerporation;

class Solution {
    public int firstUniqChar(final String s) {
        final int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            final char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            final char ch = s.charAt(i);
            if (arr[ch - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}