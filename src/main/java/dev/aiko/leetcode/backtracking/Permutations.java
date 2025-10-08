package dev.aiko.leetcode.backtracking;

import java.util.*;

// https://leetcode.com/problems/permutations
public class Permutations {
  public List<List<Integer>> permute(int[] nums) {
    var result = new ArrayList<List<Integer>>();
    backtrack(result, nums, new LinkedHashSet<Integer>());
    return result;
  }

  private void backtrack(
      List<List<Integer>> result, int[] nums, LinkedHashSet<Integer> currentPermutation) {
    if (currentPermutation.size() == nums.length) {
      result.add(new ArrayList<>(currentPermutation));
      return;
    }
    for (var num : nums) {
      if (!currentPermutation.contains(num)) {
        currentPermutation.add(num);
        backtrack(result, nums, currentPermutation);
        currentPermutation.remove(num);
      }
    }
  }
}
