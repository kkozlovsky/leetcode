package ru.kerporation;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void subsets() {
        final Solution solution = new Solution();
        assertTrue(CollectionUtils.isEqualCollection(List.of(List.of(), List.of(1), List.of(2), List.of(1, 2), List.of(3), List.of(1, 3), List.of(2, 3), List.of(1, 2, 3)), solution.subsets(new int[]{1, 2, 3})));
    }
}