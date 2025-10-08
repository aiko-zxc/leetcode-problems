package dev.aiko.leetcode.stack;

import java.util.*;

// https://leetcode.com/problems/valid-parenthese
class ValidParenthese {
  public boolean isValid(String s) {
    LinkedList<Character> stack = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
      char symbol = s.charAt(i);
      if (symbol == '(' || symbol == '[' || symbol == '{') {
        stack.add(symbol);
        continue;
      }

      if (stack.isEmpty()) {
        return false;
      }
      char prev = stack.removeLast();
      if ((symbol == ')' && prev != '(')
          || (symbol == ']' && prev != '[')
          || (symbol == '}' && prev != '{')) {
        return false;
      }
    }
    return stack.isEmpty();
  }
}
