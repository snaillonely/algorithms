package com.luosk.leetcode;

import com.luosk.leetcode.utils.ListNode;

public class Q206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return reverseList_01(head);
    }

    private ListNode reverseList_01(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;

        while (p.next != null) {
            ListNode temp = p.next;
            p.next = p.next.next;
            temp.next = dummy.next;
            dummy.next = temp;
        }

        return dummy.next;
    }
}
