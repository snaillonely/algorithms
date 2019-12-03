package com.luosk.leetcode;

import com.luosk.leetcode.utils.ListNode;

public class Q142_LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        return detectCycle_01(head);
    }

    private ListNode detectCycle_01(ListNode head) {
        if (head == null || head.next == null) { return null; }
        ListNode fast = head.next, slow = head;
        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;
        while (fast != slow.next) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}
