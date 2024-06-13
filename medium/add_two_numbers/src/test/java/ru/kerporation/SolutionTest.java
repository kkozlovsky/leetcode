package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addTwoNumbers() {
        final Solution solution = new Solution();
        final ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        final ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        final ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }
}