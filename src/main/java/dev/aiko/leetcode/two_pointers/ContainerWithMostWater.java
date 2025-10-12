package dev.aiko.leetcode.two_pointers;

// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;
        while (left != right) {
            int first = arr[left];
            int second = arr[right];
            int min = first < second ? first : second;
            int area = min * (right - left);
            if (area > maxArea) {
                maxArea = area;
            }
            if (first < second) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
