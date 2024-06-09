package ru.kerporation;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(final String ransomNote,
                                final String magazine) {

        // Create a HashMap to store character counts
        final Map<Character, Integer> dictionary = new HashMap<>();

        // Iterate through the characters in the magazine
        for (int i = 0; i < magazine.length(); i++) {
            final char c = magazine.charAt(i);

            // If the character is not present in the HashMap, add it with count 1
            if (!dictionary.containsKey(c)) {
                dictionary.put(c, 1);
            } else {
                // If the character is already present, increment its count by 1
                dictionary.put(c, dictionary.get(c) + 1);
            }
        }

        // Iterate through the characters in the ransom note
        for (int i = 0; i < ransomNote.length(); i++) {
            final char c = ransomNote.charAt(i);

            // If the character is present in the HashMap and its count is greater than 0,
            // decrement its count by 1
            if (dictionary.containsKey(c) && dictionary.get(c) > 0) {
                dictionary.put(c, dictionary.get(c) - 1);
            } else {
                // If the character is not present or its count is 0, return false
                return false;
            }
        }

        // All characters in the ransom note have been processed successfully,
        // so the ransom note can be formed from the magazine
        return true;
    }
}