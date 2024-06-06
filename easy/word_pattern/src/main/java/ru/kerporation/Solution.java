package ru.kerporation;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(final String s,
                               final String t) {

        final String[] tt = t.split(" ", -1);

        if (s.length() != tt.length) {
            return false;
        }
        final Map<Character, String> a = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (a.containsKey(s.charAt(i))) {
                final String res = a.get(s.charAt(i));
                if (!res.equals(tt[i])) {
                    return false;
                }
            } else if (a.containsValue(tt[i])) {
                return false;
            } else {
                a.put(s.charAt(i), tt[i]);
            }
        }
        return true;
    }
}