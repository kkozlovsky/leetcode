package ru.kerporation;

class Solution {
    public ListNode swapPairs(final ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode temp;
        temp = head;
        while (temp != null) {
            int t = temp.val;
            if (temp.next != null) {
                temp.val = temp.next.val;
                temp.next.val = t;
                temp = temp.next;
            }
            temp = temp.next;
        }
        return head;
    }
}