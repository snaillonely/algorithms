package com.luosk.leetcode;

import com.luosk.leetcode.utils.ListNode;

public class Q061_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        return rotateRight_01(head, k);
    }

    private ListNode rotateRight_01(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy, second = dummy;
        while (k-- > 0) {
            if (first.next == null) { first = dummy; }
            else { first = first.next; }
        }

        if (first.next != null) {
            while (first.next != null) {
                first = first.next;
                second = second.next;
            }

            first.next = dummy.next;
            dummy.next = second.next;
            second.next = null;
        }

        return dummy.next;
    }
}
