package dev.aiko.leetcode.two_pointers;

// https://leetcode.com/problems/two-sum
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;

        while (index1 <= index2) {
            int start = numbers[index1];
            int end = numbers[index2];
            if (start + end == target) {
                return new int[]{index1 + 1, index2 + 1};
            }
            if (start + end > target) {
                index2--;
            } else {
                index1++;
            }
        }
        return new int[]{};
    }
}
