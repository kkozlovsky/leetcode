package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void jump() {
        assertEquals(2, new Solution().jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(2, new Solution().jump(new int[]{2, 3, 0, 1, 4}));
        assertEquals(2, new Solution().jump(new int[]{2, 3, 0, 0, 4}));
        assertEquals(2, new Solution().jump(new int[]{2, 3, 1, 0, 4}));
        assertEquals(3, new Solution().jump(new int[]{2, 3, 1, 0, 0, 4}));
    }
}