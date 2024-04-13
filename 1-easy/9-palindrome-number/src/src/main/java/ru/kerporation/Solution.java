package ru.kerporation;

class Solution {
    public boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }
        final String stringValue = Integer.toString(x);
        return stringValue.equalsIgnoreCase(new StringBuilder(stringValue).reverse().toString());
    }

    public boolean isPalindrome2(int x) {
        final String s = String.valueOf(x);
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
