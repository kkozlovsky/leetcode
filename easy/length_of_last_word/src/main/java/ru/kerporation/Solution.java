package ru.kerporation;

class Solution {
    public int lengthOfLastWord(final String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        final String[] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }

        return words[words.length - 1].length();
    }

    public int lengthOfLastWord1(String s) {
        s = s.trim();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                count += 1;
            }
        }
        return count;
    }
}