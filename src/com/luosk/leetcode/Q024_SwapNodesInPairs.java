package com.luosk.leetcode;

import com.luosk.leetcode.utils.ListNode;

public class Q024_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        return swapPairs_01(head);
    }

    private ListNode swapPairs_01(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode p = dummy;

        while (p.next != null && p.next.next != null) {
            ListNode temp = p.next.next;
            p.next.next = temp.next;
            temp.next = p.next;
            p.next = temp;

            p = p.next.next;
        }

        return dummy.next;
    }
}
