package dev.aiko.leetcode.two_pointers;

// https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {
    public boolean isSubsequence(String sub, String text) {
        if (sub.length() == 0) {
            return true;
        }
        int subIter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == sub.charAt(subIter)) {
                if (subIter == sub.length() - 1) {
                    return true;
                }
                subIter++;
            }
        }
        return false;
    }
}
