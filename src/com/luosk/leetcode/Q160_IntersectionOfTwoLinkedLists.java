package com.luosk.leetcode;

import com.luosk.leetcode.utils.ListNode;

import java.util.Stack;

public class Q160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return getIntersectionNode_01(headA, headB);
    }

    private ListNode getIntersectionNode_01(ListNode headA, ListNode headB) {
        Stack<ListNode> stackA = new Stack<>(), stackB = new Stack<>();
        ListNode p1 = headA, p2 = headB;
        while (p1 != null) {
            stackA.push(p1);
            p1 = p1.next;
        }

        while (p2 != null) {
            stackB.push(p2);
            p2 = p2.next;
        }

        ListNode p = null;
        while (!stackA.isEmpty() && !stackB.isEmpty() && stackA.peek() == stackB.peek()) {
            p = stackA.pop();
            stackB.pop();
        }

        return p;
    }

    private ListNode getIntersectionNode_02(ListNode headA, ListNode headB) {
        return null;
    }
}
