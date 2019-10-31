package com.luosk.leetcode.utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    // For test
    public String toString() {
        String result = "";

        ListNode p = next;
        result += val;
        while (p != null) {
            result = result + "->" + p.val;
            p = p.next;
        }

        return result;
    }

    public static ListNode makeList(int[] nums) {
        ListNode header = new ListNode(0);

        ListNode p = header;
        for (int i = 0; i < nums.length; i++) {
            p.next = new ListNode(nums[i]);
            p = p.next;
        }

        return header.next;
    }
}
