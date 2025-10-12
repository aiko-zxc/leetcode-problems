package dev.aiko.leetcode.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/two-sum
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> indexes = countMap.getOrDefault(nums[i], new ArrayList<>());
            indexes.add(i);
            countMap.put(nums[i], indexes);
        }

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int expected = target - current;
            if (!countMap.containsKey(expected)) {
                continue;
            }
            List<Integer> indexes = countMap.get(expected);
            for (int index : indexes) {
                if (index != i) {
                    return new int[]{i, index};
                }
            }
        }
        return new int[]{};
    }
}
