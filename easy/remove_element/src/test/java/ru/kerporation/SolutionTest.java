package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeElement() {
        Solution solution = new Solution();
//        assertEquals(2, solution.removeElement(new int[]{3,2,2,3}, 3));
        assertEquals(7, solution.removeElement(new int[]{0,1,2,2,3,0,4,2,8,9}, 2));
    }
}