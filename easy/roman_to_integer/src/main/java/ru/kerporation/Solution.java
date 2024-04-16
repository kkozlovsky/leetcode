package ru.kerporation;

import java.util.HashMap;
import java.util.Map;


public class Solution {


    public int romanToInt(final String s) {

        final Map<Character, Integer> romanDictionary = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int answer = 0;
        int current = 0;
        int previous;

        for (int i = 0; i < s.length(); i++) {
            previous = current;
            current = romanDictionary.get(s.charAt(i));

            if (previous < current) {
                answer -= previous;
                answer += (current - previous);
            } else {
                answer += current;
            }
        }
        return answer;
    }
}

/*
Read the string character by character and during every step note the current character and the previous character.
If the current character is the same as the previous, increase the run length by 1.
If the current character has a smaller value than the previous, add run length * value of previous character to the total, and reset run length to 1.
If the current character has a greater value than the previous, subtract run length * value of previous character from the total, and reset run length to 1.
*/