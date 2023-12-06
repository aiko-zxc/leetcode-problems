package dev.aiko.leetcode;

// https://leetcode.com/problems/valid-palindrome
public class ValidPalindrome {
  public boolean isPalindrome(String s) {
    var str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int i = 0;
    int j = str.length() - 1;
    for (; i < j; i++, j--) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
    }
    return true;
  }
}
