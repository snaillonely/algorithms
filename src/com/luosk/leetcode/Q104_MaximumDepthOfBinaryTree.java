package com.luosk.leetcode;

import com.luosk.leetcode.utils.TreeNode;

public class Q104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return maxDepth_01(root);
    }

    private int maxDepth_01(TreeNode root) {
        if (root == null) { return 0; }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
