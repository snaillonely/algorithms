package com.luosk.leetcode;


public class Q045_JumpGameII {
    public int jump(int[] nums) {
        return jump_01(nums);
    }

    private int jump_01(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j <= nums[i] && i + j < dp.length; j++) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
            }
        }

        return dp[nums.length - 1];
    }

    // todo: review
    private int jump_02(int[] nums) {
        int step = 0, cur = 0, next = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > cur) {
                cur = next;
                ++step;
            }
            next = Math.max(next, nums[i] + i);
        }

        return step;
    }
}
