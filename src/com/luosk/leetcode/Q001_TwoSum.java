package com.luosk.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        return twoSum_01(nums, target);
    }

    /*
     * time: O(n^2)
     * space: O(1)
     */
    private int[] twoSum_01(int[] nums, int target) {
        int[] result = new int[]{-1, -1};

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }

        return result;
    }

    /*
     * time: O(n)
     * space: O(n)
     */
    private int[] twoSum_02(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;

                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}
