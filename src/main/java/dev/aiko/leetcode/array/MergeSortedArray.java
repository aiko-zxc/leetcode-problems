package dev.aiko.leetcode.array;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/merge-sorted-array
public class MergeSortedArray {
    public void merge(int[] firstArr, int firstLength, int[] secondArr, int secondLength) {
        int first = 0;
        int second = 0;
        List<Integer> result = new ArrayList<>(firstLength + secondLength);
        while (first != firstLength || second != secondLength) {
            if (first == firstLength) {
                result.add(secondArr[second++]);
                continue;
            }
            if (second == secondLength) {
                result.add(firstArr[first++]);
                continue;
            }
            if (firstArr[first] < secondArr[second]) {
                result.add(firstArr[first++]);
            } else {
                result.add(secondArr[second++]);
            }
        }
        for (int i = 0; i < result.size(); i ++) {
            firstArr[i] = result.get(i);
        }
    }
}
