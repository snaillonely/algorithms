package com.luosk.leetcode;


// todo: review
public class Q042_TrappingRainWater {

    public int trap(int[] height) {
        return trap_01(height);
    }

    private int trap_01(int[] height) {
        int result = 0;
        int left = 0, right = height.length - 1;
        int leftHeight = height[left], rightHeight = height[right];

        while (left < right) {
            if (leftHeight < rightHeight) {
                left++;
                if (leftHeight > height[left]) {
                    result += leftHeight - height[left];
                } else {
                    leftHeight = height[left];
                }
            } else {
                right--;
                if (rightHeight > height[right]) {
                    result += rightHeight - height[right];
                } else {
                    rightHeight = height[right];
                }
            }
        }

        return result;
    }
}
