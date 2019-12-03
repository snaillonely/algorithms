package com.luosk.leetcode;

public class Q055_JumpGame {
    public boolean canJump(int[] nums) {
        return canJump_01(nums);
    }

    private boolean canJump_01(int[] nums) {
        int max = 0, cur = 0;
        while (max < nums.length - 1) {
            max = Math.max(max, cur + nums[cur]);
            if (cur == max && nums[cur] == 0) {
                break;
            }
            ++cur;
        }

        return max >= nums.length - 1;
    }
}
