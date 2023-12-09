package dev.aiko.leetcode;

// https://leetcode.com/problems/path-sum
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return check(root, targetSum, 0);
    }

    public boolean check(TreeNode root, int targetSum, int currentSum) {
        if (root == null) {
            return false;
        }
        if (root.val + currentSum == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return check(root.left, targetSum, currentSum + root.val)
                || check(root.right, targetSum, currentSum + root.val);
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
