package ru.kerporation;

class Solution {
    public boolean isSubsequence(final String s,
                                 final String t) {
        int si = 0;
        if (s.isEmpty()) {
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(si) == t.charAt(i))
                si++;
            if (si == s.length())
                return true;
        }
        return false;
    }
}