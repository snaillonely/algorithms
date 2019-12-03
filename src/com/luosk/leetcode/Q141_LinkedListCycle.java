package com.luosk.leetcode;

import com.luosk.leetcode.utils.ListNode;

public class Q141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        return hasCycle_01(head);
    }

    private boolean hasCycle_01(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}
