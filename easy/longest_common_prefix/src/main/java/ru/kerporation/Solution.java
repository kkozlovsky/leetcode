package ru.kerporation;

/**
 * Hello world!
 */
public class Solution {

    public String longestCommonPrefix(final String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strs[0].length() ; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return builder.toString();
                }
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return builder.toString();
                }
            }
            builder.append(strs[0].charAt(i));
        }
        return builder.toString();
    }
}
