package com.luosk.leetcode;

public class Q011_ContainerWithMostWater {
    public int maxArea(int[] height) {
        return maxArea_02(height);
    }


    /*
     * time: O(n^2)
     * space: O(1)
     */
    private int maxArea_01(int[] height) {
        int result = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                result = Math.max(result, Math.min(height[i], height[j]) * (j - i));
            }
        }

        return result;
    }

    /*
     * time: O(n)
     * space: O(1)
     */
    private int maxArea_02(int[] height) {
        int result = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            result = Math.max(result, Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
