package com.luosk.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q078_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        return subsets_01(nums);
    }

    private List<List<Integer>> subsets_01(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
        result.add(new ArrayList<>(list));

        for (int i = start; i < nums.length; ++i) {
            list.add(nums[i]);
            helper(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
