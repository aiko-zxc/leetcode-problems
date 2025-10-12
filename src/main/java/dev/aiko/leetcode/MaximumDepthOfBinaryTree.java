package dev.aiko.leetcode;

import dev.aiko.leetcode.common.TreeNode;

// https://leetcode.com/problems/maximum-depth-of-binary-tree
public class MaximumDepthOfBinaryTree {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return left > right ? 1 + left : 1 + right;
  }
}
