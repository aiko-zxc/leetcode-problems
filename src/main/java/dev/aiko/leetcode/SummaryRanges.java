package dev.aiko.leetcode;

import java.util.*;

// https://leetcode.com/problems/summary-ranges
public class SummaryRanges {
  public List<String> summaryRanges(int[] nums) {
    if (nums.length == 0) {
      return Collections.emptyList();
    }
    List<String> result = new ArrayList<>();
    int rangeStart = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] - 1 == nums[i - 1]) {
        continue;
      }

      if (nums[i - 1] == rangeStart) {
        result.add(rangeStart + "");
      } else {
        result.add(rangeStart + "->" + nums[i - 1]);
      }
      rangeStart = nums[i];
    }

    if (rangeStart == nums[nums.length - 1]) {
      result.add(rangeStart + "");
    } else {
      result.add(rangeStart + "->" + nums[nums.length - 1]);
    }

    return result;
  }
}
