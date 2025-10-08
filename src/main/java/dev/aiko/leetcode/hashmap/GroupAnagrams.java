package dev.aiko.leetcode.hashmap;

import java.util.*;

// https://leetcode.com/problems/permutations
public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<Map<Character, Integer>, List<String>> letterCounterToListOfWords = new HashMap<>();
    for (String str : strs) {
      Map<Character, Integer> letterCounter = new HashMap<>();
      for (int i = 0; i < str.length(); i++) {
        char symbol = str.charAt(i);
        int counter = letterCounter.getOrDefault(symbol, 0);
        letterCounter.put(symbol, counter + 1);
      }
      List<String> words =
          letterCounterToListOfWords.getOrDefault(letterCounter, new ArrayList<>());
      words.add(str);
      letterCounterToListOfWords.put(letterCounter, words);
    }
    return new ArrayList<>(letterCounterToListOfWords.values());
  }
}
