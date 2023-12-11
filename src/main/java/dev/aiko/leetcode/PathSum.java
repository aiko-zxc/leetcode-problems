package dev.aiko.leetcode;

import dev.aiko.leetcode.common.TreeNode;

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
}
