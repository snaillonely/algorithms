package com.luosk.leetcode;

public class Q238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        return productExceptSelf_01(nums);
    }

    private int[] productExceptSelf_01(int[] nums) {
        if (nums == null || nums.length < 2) { return nums; }

        int[] result = new int[nums.length];
        result[0] = 1;

        for (int i = 1; i < nums.length; ++i) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; --i) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}
