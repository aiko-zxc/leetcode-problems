package dev.aiko.leetcode.array;

// https://leetcode.com/problems/rotate-array/
public class RotateArray {
    // only edit
    public void rotate(int[] nums, int k) {
        int shift = k % nums.length;
        int[] end = new int[shift];
        for (int i = 0; i < shift; i++) {
            end[i] = nums[nums.length - shift + i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i - shift >= 0) {
                nums[i] = nums[i - shift];
            } else {
                nums[i] = end[i];
            }
        }
    }

    // new arr
    public void rotateV2(int[] nums, int k) {
        int length = nums.length;
        int shift = k % length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = nums[(i - shift + length) % length];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = result[i];
        }
    }
}
