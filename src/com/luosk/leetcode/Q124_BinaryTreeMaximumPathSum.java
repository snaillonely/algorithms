package com.luosk.leetcode;

import com.luosk.leetcode.utils.TreeNode;

public class Q124_BinaryTreeMaximumPathSum {

    public int maxPathSum(TreeNode root) {
        return maxPathSum_01(root);
    }

    private int max = Integer.MIN_VALUE;

    private int maxPathSum_01(TreeNode root) {
        helper(root);
        return max;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left), right = helper(root.right);

        max = Math.max(max, root.val + left + right);
        int sum = root.val + Math.max(left, right);
        return sum > 0 ? sum : 0;
    }
}
