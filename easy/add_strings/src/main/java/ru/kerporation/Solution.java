package ru.kerporation;

import java.math.BigInteger;

class Solution {
    public String addStrings(final String num1,
                             final String num2) {
        return new BigInteger(num1).add(new BigInteger(num2)).toString();
    }
}