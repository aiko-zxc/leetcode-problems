package dev.aiko.leetcode;

// https://leetcode.com/problems/same-tree
public class SameTree {

    public boolean isSameTree(TreeNode a, TreeNode b) {
        if (a == null ^ b == null) {
            return false;
        }
        // if 'a' is null, 'b' is also null, checked above.
        if (a == null) {
            return true;
        }
        return a.val == b.val && isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
