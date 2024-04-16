package ru.kerporation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mergeTwoLists() {

        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        Solution solution = new Solution();
        final ListNode resultListNode = solution.mergeTwoLists(listNode1, listNode2);
        assertEquals("(1)->(1)->(2)->(3)->(4)->(4)->null", resultListNode.toString());
    }
}