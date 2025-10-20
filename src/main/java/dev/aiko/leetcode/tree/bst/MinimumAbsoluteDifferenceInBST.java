package dev.aiko.leetcode.tree.bst;

import dev.aiko.leetcode.tree.common.TreeNode;

// https://leetcode.com/problems/minimum-absolute-difference-in-bst
public class MinimumAbsoluteDifferenceInBST {
    int min = Integer.MAX_VALUE;
    Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        int val = node.val;
        if (prev != null) {
            min = Math.min(val - prev, min);
        }
        prev = val;
        inorder(node.right);
    }
}
