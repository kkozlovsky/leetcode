package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void swapPairs() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode result = solution.swapPairs(head);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
    }
}