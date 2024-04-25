package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void getIntersectionNode() {
        final Solution solution = new Solution();
        final ListNode headA = new ListNode(1);
        final ListNode headB = new ListNode(2);
        headA.next = new ListNode(3);
        headB.next = new ListNode(4);
        headA.next.next = new ListNode(5);
        headB.next.next = headA.next;
        assertEquals(headA.next, solution.getIntersectionNode(headA, headB));
    }
}