package ru.kerporation;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(final int numRows) {
        final List<List<Integer>> output = new ArrayList<>();

        if (numRows <= 0) {
            return output;
        }
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        output.add(prev);

        for (int i = 2; i <= numRows; i++) {
            final List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 0; j < prev.size() - 1; j++) {
                curr.add(prev.get(j) + prev.get(j + 1));
            }
            curr.add(1);
            output.add(curr);
            prev = curr;
        }
        return output;
    }
}