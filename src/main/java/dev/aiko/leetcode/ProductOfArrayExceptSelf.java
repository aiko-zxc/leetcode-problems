package dev.aiko.leetcode;

// https://leetcode.com/problems/product-of-array-except-self
public class ProductOfArrayExceptSelf {
  public int[] productExceptSelf(int[] nums) {
    int[] pre = new int[nums.length];
    int[] post = new int[nums.length];

    int product = 1;
    for (int i = 0; i < nums.length; i++) {
      pre[i] = product;
      product *= nums[i];
    }

    product = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      post[i] = product;
      product *= nums[i];
    }

    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      result[i] = pre[i] * post[i];
    }

    return result;
  }
}
