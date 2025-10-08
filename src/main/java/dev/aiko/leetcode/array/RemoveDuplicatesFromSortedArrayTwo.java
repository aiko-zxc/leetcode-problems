package dev.aiko.leetcode.array;

import java.util.Arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
public class RemoveDuplicatesFromSortedArrayTwo {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length <= 2) {
            return length;
        }
        int start = 2;
        for (int next = 2; next < length; next++) {
            if (nums[next] != nums[start - 2]) {
                nums[start] = nums[next];
                start++;
            }
        }
        return start;
    }
}
