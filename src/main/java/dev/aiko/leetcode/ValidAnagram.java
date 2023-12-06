package dev.aiko.leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/valid-anagram
public class ValidAnagram {
  public boolean isAnagram(String first, String second) {
    Map<Character, Integer> firstLetters = new HashMap<>();
    for (int i = 0; i < first.length(); i++) {
      char symbol = first.charAt(i);
      int counter = firstLetters.getOrDefault(symbol, 0);
      firstLetters.put(symbol, counter + 1);
    }

    for (int i = 0; i < second.length(); i++) {
      char symbol = second.charAt(i);
      int counter = firstLetters.getOrDefault(symbol, 0);
      if (counter == 0) {
        return false;
      }
      firstLetters.put(symbol, counter - 1);
    }
    return firstLetters.values().stream().allMatch(counter -> counter == 0);
  }
}
