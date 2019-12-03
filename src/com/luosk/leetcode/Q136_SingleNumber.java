package com.luosk.leetcode;

public class Q136_SingleNumber {
    public int singleNumber(int[] nums) {
        return singleNumber_01(nums);
    }

    private int singleNumber_01(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
