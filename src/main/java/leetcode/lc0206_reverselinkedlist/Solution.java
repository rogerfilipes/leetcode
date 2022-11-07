package leetcode.lc0206_reverselinkedlist;

import leetcode.common.ListNode;

/**
 * 206. Reverse Linked List <a href="https://leetcode.com/problems/reverse-linked-list/" /a>
 * <p>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode previous = null;
        ListNode next;

        while (current != null) {
            next = current.next != null ? current.next : null;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }


}
