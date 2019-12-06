package com.luosk;

import com.luosk.leetcode.Q206_ReverseLinkedList;
import com.luosk.leetcode.utils.ListNode;

public class Main {

    public static void main(String[] args) {

        Q206_ReverseLinkedList solution = new Q206_ReverseLinkedList();
        ListNode head = ListNode.makeList(new int[]{1, 2, 3, 4, 5});
        System.out.println(solution.reverseList(head));
    }
}
