package ru.kerporation;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(final int n) {
        final List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    private void backtrack(final List<String> list,
                           final String str,
                           final int open,
                           final int close,
                           final int max) {

        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max) {
            backtrack(list, str + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(list, str + ")", open, close + 1, max);
        }
    }
}