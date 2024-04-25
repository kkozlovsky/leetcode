package ru.kerporation;

public class Solution {
    public ListNode getIntersectionNode(final ListNode headA,
                                        final ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a != null ? a.next : headB;
            b = b != null ? b.next : headA;
        }
        return a;
    }
}