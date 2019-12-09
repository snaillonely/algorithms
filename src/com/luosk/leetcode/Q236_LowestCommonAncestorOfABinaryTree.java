package com.luosk.leetcode;

import com.luosk.leetcode.utils.TreeNode;

public class Q236_LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lowestCommonAncestor_01(root, p, q);
    }

    private TreeNode lowestCommonAncestor_01(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) { return root; }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left == null ? right : left;
    }
}


