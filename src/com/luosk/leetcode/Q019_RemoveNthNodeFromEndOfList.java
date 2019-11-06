package com.luosk.leetcode;

import com.luosk.leetcode.utils.ListNode;

public class Q019_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy, last = dummy;
        while (--n > 0 && first != null) {
            first = first.next;
        }

        while (first.next != null) {
            first = first.next;
            last = last.next;
        }

        last.next = last.next.next;

        return dummy.next;
    }
}
