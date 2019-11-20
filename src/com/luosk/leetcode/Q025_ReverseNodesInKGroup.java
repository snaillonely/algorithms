package com.luosk.leetcode;

import com.luosk.leetcode.utils.ListNode;

import java.util.Stack;

public class Q025_ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        return null;
    }

    private ListNode reverseKGroup_01(ListNode head, int k) {
        if (head == null || head.next == null || k <= 1) {
            return head;
        }

        int count = 0;
        ListNode cur = head;
        while (cur != null && count != k) {
            cur = cur.next;
            count++;
        }

        if (count == k) {
            cur = reverseKGroup(cur, k);
            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = cur;
                cur = head;
                head = temp;
            }

            head = cur;
        }

        return head;
    }

    private ListNode reverseKGroup_02(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        if (k <= 1) {
            return dummy.next;
        }

        ListNode p = dummy;
        while (p.next != null) {
            int index = 0;
            ListNode current = p;

            while (index++ < k && current.next != null) {
                current = current.next;
            }

            if (index < k) {
                break;
            }

            ListNode start = p.next;
            while (p.next != current) {
                ListNode temp = p.next;
                p.next = p.next.next;
                temp.next = current.next;
                current.next = temp;
            }

            p = start;
        }

        return dummy.next;
    }

    // use a stack
    private ListNode reverseKGroup_03(ListNode head, int k) {
        if (k <= 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            if (stack.size() < k) {
                stack.push(head);
                head = head.next;
            }

            if (stack.size() == k) {
                while (stack.size() > 0) {
                    ListNode node = stack.pop();
                    p.next = node;
                    p = p.next;
                }

                p.next = head;
            }
        }

        return dummy.next;
    }

    private ListNode reverseKGroup_04(ListNode head, int k) {
        return null;
    }
}
