package com.luosk.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q215_KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        return findKthLargest_01(nums, k);
    }

    private int findKthLargest_01(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(k);
        for (int num : nums) {
            queue.offer(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.poll();
    }
}
