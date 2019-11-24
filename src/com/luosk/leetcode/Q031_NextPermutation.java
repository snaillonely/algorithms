package com.luosk.leetcode;

public class Q031_NextPermutation {
    public void nextPermutation(int[] nums) {
        nextPermutation_01(nums);
    }

    // todo: review
    private void nextPermutation_01(int[] nums) {
        int start = nums.length - 2;
        while (start >= 0 && nums[start] >= nums[start + 1]) {
            --start;
        }

        if (start >= 0) {
            int end = start;
            while (end < nums.length - 1 && nums[start] < nums[end + 1]) {
                end++;
            }

            swap(nums, start, end);
        }

        reverse(nums, start + 1, nums.length - 1);
    }


    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
