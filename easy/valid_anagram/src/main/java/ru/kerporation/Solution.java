package ru.kerporation;

class Solution {
    public boolean isAnagram(final String s,
                             final String t) {
        if (s == null || t == null) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        char[] arr = new char[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (char c : arr) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}