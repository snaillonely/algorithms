package com.luosk.leetcode;

public class Q034_FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        if (nums != null && nums.length != 0) {
            result[0] = lowerSearch(nums, 0, nums.length - 1, target);
            result[1] = result[0] == -1 ? -1 : higherSearch(nums, 0, nums.length - 1, target);
        }

        return result;
    }

    private int lowerSearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            if (nums[low] == target) { return low; }
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                high = mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int higherSearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            if (nums[high] == target) { return high; }
            int mid = low + (high + 1 - low) / 2;
            if (nums[mid] == target) {
                low = mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
