package com.luosk.leetcode;

import com.luosk.leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Q023_MergeKSortedLists {
    public ListNode mergeKList(ListNode[] lists) {
        return mergeKLists_01(lists);
    }

    private ListNode mergeKLists_01(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;

        for (ListNode list : lists) {
            if (list != null) {
                queue.add(list);
            }
        }

        while (!queue.isEmpty()) {
            p.next = queue.poll();
            p = p.next;

            if (p.next != null) {
                queue.add(p.next);
            }
        }

        return dummy.next;
    }

    private ListNode mergeKLists_02(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        List<ListNode> l = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null) {
                continue;
            }

            ListNode dummy = new ListNode(0);
            dummy.next = lists[i];

            l.add(dummy);
        }

        ListNode dummy = new ListNode(0);
        ListNode p = dummy;

        while (l.size() > 0) {
            int min  = 0;
            for (int i = 1; i < l.size(); i++) {
                if (l.get(i).next.val < l.get(min).next.val) {
                    min = i;
                }
            }

            p.next = l.get(min);
            p = p.next;
            l.get(min).next = l.get(min).next.next;

            if (l.get(min).next == null) {
                l.remove(l.get(min));
            }
        }

        return dummy.next;
    }
}
