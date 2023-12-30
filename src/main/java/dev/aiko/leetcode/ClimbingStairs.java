package dev.aiko.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
  public int climbStairs(int n) {
    return climb(0, n, new HashMap<>());
  }

  private int climb(int n, int target, Map<Integer, Integer> memo) {
    if (memo.containsKey(n)) {
      return memo.get(n);
    }
    if (n == target) {
      return 1;
    }
    if (n > target) {
      return 0;
    }
    int res = climb(n + 1, target, memo) + climb(n + 2, target, memo);
    memo.put(n, res);
    return res;
  }
}
