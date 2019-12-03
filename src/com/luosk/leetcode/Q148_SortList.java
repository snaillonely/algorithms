package com.luosk.leetcode;

import com.luosk.leetcode.utils.ListNode;

public class Q148_SortList {
    public ListNode sortList(ListNode head) {
        return sortList_01(head);
    }

    private ListNode sortList_01(ListNode head) {
        if (head == null || head.next == null) { return head; }
        ListNode mid = findMiddle(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = head;

        return merge(sortList(left), sortList(right));
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        p.next = (l1 == null ? l2 : l1);
        return dummy.next;
    }
}
