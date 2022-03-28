package com.luosk.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lucas.luo at 2022/3/28.
 *
 * @author lucas.luo
 * @since 2022/3/28
 */

public class Q0090_SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
         return subsetsWithDup_01(nums);
    }

    private List<List<Integer>> subsetsWithDup_01(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        helper(result, new ArrayList<>(), nums, 0);

        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
        result.add(new ArrayList<>(list));

        for (int i = start; i < nums.length; ++i) {
            list.add(nums[i]);
            helper(result, list, nums, i + 1);
            int temp = list.remove(list.size() - 1);
            while (i < nums.length - 1 && nums[i + 1] == temp) {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        Q0090_SubsetsII solution = new Q0090_SubsetsII();
        List<List<Integer>> result = solution.subsetsWithDup(nums);
        System.out.println(result);
    }

}
