package ru.kerporation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(final String digits) {
        final List<String> res = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return res;
        }

        final Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), res, digitToLetters);

        return res;
    }

    private void backtrack(final String digits,
                           final int idx,
                           final StringBuilder comb,
                           final List<String> res,
                           final Map<Character, String> digitToLetters) {

        if (idx == digits.length()) {
            res.add(comb.toString());
            return;
        }

        final String letters = digitToLetters.get(digits.charAt(idx));
        for (final char letter : letters.toCharArray()) {
            comb.append(letter);
            backtrack(digits, idx + 1, comb, res, digitToLetters);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}