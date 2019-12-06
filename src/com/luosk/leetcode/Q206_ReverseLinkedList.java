package com.luosk.leetcode;

import com.luosk.leetcode.utils.ListNode;

import java.util.Stack;

public class Q206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return reverseList_01(head);
    }

    private ListNode reverseList_01(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Stack<ListNode> stack = new Stack<>();

        ListNode p = dummy;
        while (p.next != null) {
            ListNode node = p.next;
            p.next = p.next.next;
            node.next = null;
            stack.push(node);
        }

        while (!stack.isEmpty()) {
            p.next = stack.pop();
            p = p.next;
        }

        return dummy.next;
    }

    private ListNode reverseList_02(ListNode head) {
        ListNode dummy = new ListNode(0);
        while (head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = dummy.next;
            dummy.next = temp;
        }

        return dummy.next;
    }
}
