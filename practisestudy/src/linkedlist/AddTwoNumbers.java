package linkedlist;
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(); // Dummy node to simplify the handling of result list
        ListNode current = dummy; // Pointer to the current node in the result list
        int carry = 0; // Initialize carry to 0

        // Traverse both input lists until one of them reaches the end
        while (l1 != null || l2 != null) {
            // Get the values of current nodes (or 0 if null)
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate the sum of current digits and carry
            int sum = x + y + carry;

            // Update carry for the next calculation
            carry = sum / 10;

            // Create a new node with the digit sum % 10
            current.next = new ListNode(sum % 10);

            // Move to the next nodes in the input lists and result list
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            current = current.next;
        }

        // Handle the case when there is a carry left after the last addition
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the next node of the dummy node, which is the start of the result list
        return dummy.next;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Example 1
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        Solution solu = new Solution();
        ListNode result1 = solu.addTwoNumbers(l1, l2);
        printList(result1); // Expected: 7 -> 0 -> 8

        // Example 2
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        ListNode result2 = solu.addTwoNumbers(l3, l4);
        printList(result2); // Expected: 0

        // Example 3
       // ListNode l5 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
       // ListNode l6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
     //   ListNode result3 = solu.addTwoNumbers(l5, l6);
     //   printList(result3); // Expected: 8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1
    }

    // Utility function to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
