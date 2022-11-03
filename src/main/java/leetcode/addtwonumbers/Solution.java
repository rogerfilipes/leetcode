package leetcode.addtwonumbers;

/**
 * 2. Add Two Numbers <a href="https://leetcode.com/problems/add-two-numbers/"/>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(0, l1, l2);
    }


    public ListNode addTwoNumbers(int carryOver, ListNode l1, ListNode l2) {
        if (carryOver == 0 && l1 == null && l2 == null) {
            return null;
        }
        int l1Val = l1 != null ? l1.val : 0;
        int l2Val = l2 != null ? l2.val : 0;

        int lSum = l1Val + l2Val + carryOver;

        carryOver = lSum / 10;

        int lResult = lSum % 10;


        return new ListNode(lResult, addTwoNumbers(carryOver, l1 != null ? l1.next : null, l2 != null ? l2.next : null));

    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
}
