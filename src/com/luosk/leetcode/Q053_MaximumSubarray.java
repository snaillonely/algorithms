package com.luosk.leetcode;

public class Q053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        return maxSubArray_01(nums);
    }

    private int maxSubArray_01(int[] nums) {
        int result = Integer.MIN_VALUE, sum = 0;
        for (int num : nums) {
            sum += num;
            result = Math.max(result, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return result;
    }
}
