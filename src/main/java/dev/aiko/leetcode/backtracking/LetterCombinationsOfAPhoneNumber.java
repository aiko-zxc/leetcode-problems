package dev.aiko.leetcode.backtracking;
import java.util.*;
// https://leetcode.com/problems/letter-combinations-of-a-phone-number
public class LetterCombinationsOfAPhoneNumber {
  private static final Map<Character, List<Character>> digitToLetters =
      Map.of(
          '2', List.of('a', 'b', 'c'),
          '3', List.of('d', 'e', 'f'),
          '4', List.of('g', 'h', 'i'),
          '5', List.of('j', 'k', 'l'),
          '6', List.of('m', 'n', 'o'),
          '7', List.of('p', 'q', 'r', 's'),
          '8', List.of('t', 'u', 'v'),
          '9', List.of('w', 'x', 'y', 'z'));

  public List<String> letterCombinations(String digits) {
    if ("".equals(digits)) {
      return Collections.emptyList();
    }

    List<List<Character>> allLetters = new ArrayList<>();

    for (int i = 0; i < digits.length(); i++) {
      allLetters.add(digitToLetters.get(digits.charAt(i)));
    }
    List<String> result = new ArrayList<>();
    LinkedList<Character> current = new LinkedList<>();
    backtrack(allLetters, result, current);
    return result;
  }

  public void backtrack(
      List<List<Character>> allLetters, List<String> result, LinkedList<Character> current) {
    if (current.size() == allLetters.size()) {
      result.add(toResult(current));
      return;
    }
    for (int i = 0; i < allLetters.size(); i++) {
      if (i == current.size()) {
        List<Character> charsForButton = allLetters.get(i);
          for (Character character : charsForButton) {
              current.add(character);
              backtrack(allLetters, result, current);
              current.removeLast();
          }
      }
    }
  }

  private String toResult(List<Character> list) {
    String result = "";
    for (Character symbol : list) {
      result += symbol;
    }
    return result;
  }
}
