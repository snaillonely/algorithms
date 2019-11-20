package com.luosk.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q040_CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        return combinationSum2_01(candidates, target);
    }

    private List<List<Integer>> combinationSum2_01(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) { return null; }
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);
        helper(result, new ArrayList<>(), candidates, 0, target);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> list, int[] candidates, int start, int target) {
//        if (target == 0 && !result.contains(list)) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                list.add(candidates[i]);
                helper(result, list, candidates, i + 1, target - candidates[i]);
                list.remove(list.size() - 1);
            }
        }
    }
}
