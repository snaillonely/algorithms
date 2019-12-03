package com.luosk.leetcode;

public class Q041_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        return firstMissingPositive_00(nums);
    }

    private int firstMissingPositive_00(int[] nums) {
        if (nums == null || nums.length == 0) { return 1; }
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i]];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    private int firstMissingPositive_01(int[] nums) {
        if (nums == null || nums.length == 0) { return 1; }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }
}