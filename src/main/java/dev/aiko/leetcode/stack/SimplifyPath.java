package dev.aiko.leetcode.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SimplifyPath {
    public String simplifyPath(String path) {
        if (path == null || path.isEmpty()) {
            return "/";
        }
        Deque<String> stack = new ArrayDeque<>();

        for (String part : path.split("/")) {
            if (part.isEmpty() || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }

        List<String> parts = new ArrayList<>(stack);
        StringBuilder result = new StringBuilder();

        for (int i = parts.size() - 1; i >= 0; i--) {
            result.append('/').append(parts.get(i));
        }

        return parts.isEmpty() ? "/" : result.toString();
    }


}
