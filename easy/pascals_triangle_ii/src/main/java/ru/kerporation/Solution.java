package ru.kerporation;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(final int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 0; i < rowIndex; i++) {
            final List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j < row.size(); j++) {
                newRow.add(row.get(j - 1) + row.get(j));
            }
            newRow.add(1);
            row = newRow;
        }
        return row;
    }
}