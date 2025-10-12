package dev.aiko.leetcode.sliding_window;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-substring-without-repeating-characters
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int longest = 0;
        while (end != s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                int length = end - start + 1;
                if (length > longest) {
                    longest = length;
                }
                end++;
            } else {
                set.remove(s.charAt(start++));
            }
        }
        return longest;
    }
}
