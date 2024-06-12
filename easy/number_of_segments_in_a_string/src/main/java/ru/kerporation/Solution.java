package ru.kerporation;

class Solution {
    public int countSegments(final String s) {
        if (s == null || s.isBlank()) {
            return 0;
        }
        return s.trim().split("\\s+").length;
    }
}