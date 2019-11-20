package com.luosk.leetcode;

public class Q033_SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        return search_01(nums, target);
    }

    private int search_01(int[] nums, int target) {
        if (nums == null || nums.length == 0) { return -1; }

        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] >= nums[low]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] <= nums[high]) {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
