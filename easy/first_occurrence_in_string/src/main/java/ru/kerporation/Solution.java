package ru.kerporation;

public class Solution {
    public int strStr(final String haystack,
                      final String needle) {
        if (haystack == null ||
                needle == null ||
                needle.isEmpty() ||
                haystack.isEmpty() ||
                needle.length() > haystack.length()) {
            return -1;
        }

        return haystack.indexOf(needle);
    }
}