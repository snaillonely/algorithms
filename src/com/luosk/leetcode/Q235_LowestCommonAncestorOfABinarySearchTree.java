package com.luosk.leetcode;

import com.luosk.leetcode.utils.TreeNode;

public class Q235_LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lowestCommonAncestor_01(root, p, q);
    }

    private TreeNode lowestCommonAncestor_01(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode temp = p;
            p = q;
            q = temp;
        }

        if (p.val <= root.val && root.val <= q.val) {
            return root;
        } else if (q.val <= root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }
}
