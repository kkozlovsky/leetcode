package ru.kerporation;

public class Solution {
    ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode nextt = head;
        ListNode prev = null;
        while (curr != null) {
            nextt = nextt.next;
            curr.next = prev;
            prev = curr;
            curr = nextt;
        }
        return prev;
    }

    public boolean isPalindrome(final ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverse(slow);
        ListNode temp1 = head;
        while (temp != null) {
            if (temp1.val != temp.val) {
                return false;
            }
            temp = temp.next;
            temp1 = temp1.next;
        }
        return true;
    }
}