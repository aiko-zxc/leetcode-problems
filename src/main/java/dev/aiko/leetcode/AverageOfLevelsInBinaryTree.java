package dev.aiko.leetcode;

import dev.aiko.leetcode.common.TreeNode;
import java.util.*;

// https://leetcode.com/problems/average-of-levels-in-binary-tree/
public class AverageOfLevelsInBinaryTree {
  public List<Double> averageOfLevels(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    List<Double> result = new ArrayList<>();
    while (!q.isEmpty()) {
      double length = q.size();
      double sum = 0;
      for (int i = 0; i < length; i++) {
        TreeNode node = q.poll();
        sum += node.val;
        if (node.left != null) {
          q.offer(node.left);
        }
        if (node.right != null) {
          q.offer(node.right);
        }
      }
      result.add(sum / length);
    }
    return result;
  }
}
