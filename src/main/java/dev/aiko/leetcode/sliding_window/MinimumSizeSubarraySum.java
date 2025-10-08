package dev.aiko.leetcode.sliding_window;

// https://leetcode.com/problems/minimum-size-subarray-sum
public class MinimumSizeSubarraySum {
  public int minSubArrayLen(int target, int[] nums) {
    int start = 0;
    int end = 0;
    int sum = 0;
    int result = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      end = i;
      sum += nums[end];
      while (sum >= target) {
        if (end - start < result) {
          result = end - start;
        }
        sum -= nums[start];
        start++;
      }
    }
    if (result == Integer.MAX_VALUE) {
      return 0;
    }
    return result + 1;
  }
}
