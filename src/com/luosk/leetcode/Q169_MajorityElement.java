package com.luosk.leetcode;

public class Q169_MajorityElement {
    public int majorityElement(int[] nums) {
        return majorityElement_01(nums);
    }

    private int majorityElement_01(int[] nums) {
        int result = 0, count = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (count == 0 || result == nums[i]) {
                result = nums[i];
                count++;
            } else {
                count--;
            }
        }

        return result;
    }
}
