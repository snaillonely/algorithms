package com.luosk;

import com.luosk.leetcode.Q040_CombinationSumII;

public class Main {

    public static void main(String[] args) {
        Q040_CombinationSumII solution = new Q040_CombinationSumII();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        System.out.println(solution.combinationSum2(candidates, target));
    }
}
