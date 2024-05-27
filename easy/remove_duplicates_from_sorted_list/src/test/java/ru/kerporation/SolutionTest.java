package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void deleteDuplicates() {
        final Solution solution = new Solution();
        final ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next.next = new ListNode(6);
        final ListNode listNode = solution.deleteDuplicates(head);
        assertEquals(1, listNode.val);
        assertEquals(2, listNode.next.val);
        assertEquals(3, listNode.next.next.val);
        assertEquals(4, listNode.next.next.next.val);
        assertEquals(5, listNode.next.next.next.next.val);
        assertEquals(6, listNode.next.next.next.next.next.val);
    }
}