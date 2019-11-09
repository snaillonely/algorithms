package com.luosk.leetcode;

public class Q026_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[result] != nums[i]) {
                nums[++result] = nums[i];
            }
        }

        return result;
    }
}
