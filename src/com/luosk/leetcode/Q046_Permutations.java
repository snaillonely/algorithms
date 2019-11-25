package com.luosk.leetcode;

import java.util.ArrayList;
import java.util.List;


// todo: review
public class Q046_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        return permute_01(nums);
    }

    private List<List<Integer>> permute_01(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, nums, 0);
        return result;
    }

    private void helper(List<List<Integer>> result, int[] nums, int start) {
        if (start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            helper(result, nums, start + 1);
            swap(nums, start, i);
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    private List<List<Integer>> permute_02(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        makePermute(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void makePermute(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i <= list.size() && start < nums.length; i++) {
            list.add(i, nums[start]);
            makePermute(result, list, nums, start + 1);
            list.remove(i);
        }
    }
}
