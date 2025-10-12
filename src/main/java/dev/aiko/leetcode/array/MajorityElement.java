package dev.aiko.leetcode.array;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/majority-element
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer count = map.getOrDefault(num, 0);
            if (count >= nums.length / 2) {
                return num;
            }
            map.put(num, count + 1);
        }
        return -1;
    }
}
