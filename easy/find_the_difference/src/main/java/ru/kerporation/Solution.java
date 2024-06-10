package ru.kerporation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public char findTheDifference(final String s,
                                  final String t) {
        char c = 0;
        for (char cs : s.toCharArray()) {
            c ^= cs;
        }
        for (char ct : t.toCharArray()) {
            c ^= ct;
        }
        return c;
    }


    public char findTheDifference1(final String s,
                                   final String t) {

        final List<Character> chS = s.chars()
                .mapToObj(c -> (char) c)
                .toList();

        final List<Character> chT = new ArrayList<>(t.chars()
                .mapToObj(c -> (char) c)
                .toList());

        IntStream.range(0, chS.size())
                .forEach(i -> {
                    char current = chS.get(i);
                    if (chT.contains(current)) {
                        chT.remove(Character.valueOf(current));
                    }
                });
        return chT.getFirst();
    }
}
