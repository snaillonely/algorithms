package com.luosk.leetcode;

import java.util.*;

// todo: review
public class Q015_ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        return null;
    }

    private List<List<Integer>> threeSum_01(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[left++]);
                    res.add(nums[right--]);

                    result.add(res);

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    private List<List<Integer>> threeSum_02(int[] nums) {
        return null;
    }
}
