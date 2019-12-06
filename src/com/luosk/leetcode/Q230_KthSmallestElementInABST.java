package com.luosk.leetcode;

import com.luosk.leetcode.utils.TreeNode;

public class Q230_KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {
        return kthSmallest_01(root, k);
    }

    private int kthSmallest_01(TreeNode root, int k) {
        if (root == null) { return 0; }

        int left = helper(root.left);
        if (left == k - 1) { return root.val; }
        else if (left < k) { return kthSmallest(root.right, k - left - 1); }
        else { return kthSmallest(root.left, k); }
    }

    private int helper(TreeNode root) {
        if (root == null) { return 0; }
        return helper(root.left) + helper(root.right) + 1;
    }
}
