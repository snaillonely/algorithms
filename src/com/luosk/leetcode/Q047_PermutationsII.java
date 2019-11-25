package com.luosk.leetcode;

import java.util.ArrayList;
import java.util.List;
// todo: review
public class Q047_PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        return permuteUnique_01(nums);
    }

    private List<List<Integer>> permuteUnique_01(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        makePermute(result, new ArrayList<>(), nums, 0, new boolean[nums.length]);
        return result;
    }

    private void makePermute(List<List<Integer>> result, List<Integer> list, int[] nums, int start, boolean[] used) {
//        if (list.size() == nums.length && !result.contains(list)) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i <= list.size() && start < nums.length; ++i) {
            if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) { continue; }
            used[i] = true;
            list.add(i, nums[start]);
            makePermute(result, list, nums, start + 1, used);
            used[i] = false;
            list.remove(i);
        }
    }
}
