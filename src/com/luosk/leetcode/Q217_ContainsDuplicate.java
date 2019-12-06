package com.luosk.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        return containsDuplicate_01(nums);
    }

    private boolean containsDuplicate_01(int[] nums) {
        if (nums == null || nums.length < 2) { return false; }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    private boolean containsDuplicate_02(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
