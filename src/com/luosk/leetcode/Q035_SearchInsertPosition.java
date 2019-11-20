package com.luosk.leetcode;

public class Q035_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        return searchInsert_01(nums, target);
    }

    private int searchInsert_01(int[] nums, int target) {
        if (nums == null || nums.length == 0) { return 0; }
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

}
