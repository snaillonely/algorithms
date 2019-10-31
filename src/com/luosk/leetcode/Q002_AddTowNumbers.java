package com.luosk.leetcode;

import com.luosk.leetcode.utils.ListNode;

public class Q002_AddTowNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);

        ListNode cur = dummy, p1 = l1, p2 = l2;
        int sum = 0;

        while (p1 != null || p2 != null) {
            if (p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }

            if (p2 != null) {
                sum += p2.val;
                p2 = p2.next;
            }

            cur.next = new ListNode(sum % 10);
            sum /= 10;
            cur = cur.next;
        }

        if (sum != 0) {
            cur.next = new ListNode(sum);
        }

        return dummy.next;
    }
}
