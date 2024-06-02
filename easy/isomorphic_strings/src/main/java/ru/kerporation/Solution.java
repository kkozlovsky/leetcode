package ru.kerporation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isIsomorphic(final String s,
                                final String t) {

        final Map<Character, Character> map = new HashMap<>();
        final Set<Character> st = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (map.containsKey(chS)) {
                if (map.get(chS) != chT) {
                    return false;
                }
            } else if (st.contains(chT)) {
                return false;
            } else {
                map.put(chS, chT);
                st.add(chT);
            }
        }
        return true;
    }
}
