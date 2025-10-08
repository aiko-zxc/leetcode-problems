package dev.aiko.leetcode.tree;

import dev.aiko.leetcode.tree.common.TreeNode;

// https://leetcode.com/problems/invert-binary-tree
public class InvertBinaryTree {

  public TreeNode invertTree(TreeNode root) {
    invert(root);
    return root;
  }

  private void invert(TreeNode root) {
    if (root == null) {
      return;
    }
    TreeNode left = root.left;
    root.left = root.right;
    root.right = left;
    invert(root.left);
    invert(root.right);
  }
}
