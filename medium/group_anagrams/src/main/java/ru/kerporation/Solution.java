package ru.kerporation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(final String[] strs) {
        // Prime numbers for each character 'a' to 'z'
        final int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        // Map to hold the grouped anagrams
        final Map<Long, List<String>> map = new HashMap<>();

        for (final String word : strs) {
            long product = 1;
            // Calculate the product of prime numbers corresponding to characters in the word
            for (final char c : word.toCharArray()) {
                product *= primeNumbers[c - 'a'];
            }

            // Group words with the same product
            if (!map.containsKey(product)) {
                map.put(product, new ArrayList<>());
            }
            map.get(product).add(word);
        }

        // Collect all groups of anagrams
        return new ArrayList<>(map.values());
    }
}