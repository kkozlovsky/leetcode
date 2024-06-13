package ru.kerporation;


/*
1. Initialization : Start with a dummy node to simplify the process of building the resulting list. Initialize pointers for the two input lists and a variable to keep track of the carry.
2. Iteration and Addition : Iterate through the nodes of both lists until the end of both lists is reached. For each digit, sum the corresponding digits from both lists along with the carry from the previous addition.
3. Update Carry : Calculate the new carry and the digit to be added to the result list. The new carry is sum / 10, and the digit is sum % 10
4. Advance Pointers : Move the pointers of the input lists and the result list to their next nodes.
5. Final Carry : After the loop, if there is any remaining carry, add a new node with that carry.
6. Return Result : The result list is the next node of the dummy node used for initialization.*/

class Solution {
    public ListNode addTwoNumbers(final ListNode l1,
                                  final ListNode l2) {
        // Initialize a dummy node to build the result list.
        ListNode temp = new ListNode(0);
        ListNode currentNode = temp;

        // Initialize pointers for the input lists.
        ListNode ptrL1 = l1;
        ListNode ptrL2 = l2;

        // Initialize the carry variable.
        int carry = 0;

        // Iterate through both lists until the end of both.
        while (ptrL1 != null || ptrL2 != null) {
            // Start with the carry from the previous iteration.
            int sum = carry;

            // Add the value from the first list if available.
            if (ptrL1 != null) {
                sum += ptrL1.val;
                ptrL1 = ptrL1.next;
            }

            // Add the value from the second list if available.
            if (ptrL2 != null) {
                sum += ptrL2.val;
                ptrL2 = ptrL2.next;
            }

            // Update the carry for the next iteration.
            carry = sum / 10;

            // Create a new node with the digit and move the result list pointer.
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
        }

        // If there is a carry left after the loop, add a new node for it.
        if (carry > 0) {
            currentNode.next = new ListNode(carry);
        }

        // Return the next node of the dummy node, which is the actual result list.
        return temp.next;
    }
}