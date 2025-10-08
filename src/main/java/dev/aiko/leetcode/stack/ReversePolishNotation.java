package dev.aiko.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.BiFunction;

class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> numbers = new ArrayDeque<>();

        for (String token : tokens) {
            switch (token) {
                case "+" -> applyOperation(numbers, Integer::sum);
                case "-" -> applyOperation(numbers, (a, b) -> a - b);
                case "*" -> applyOperation(numbers, (a, b) -> a * b);
                case "/" -> applyOperation(numbers, (a, b) -> a / b);
                default -> numbers.push(Integer.parseInt(token));
            }
        }
        return numbers.pop();
    }

    private void applyOperation(Deque<Integer> numbers, BiFunction<Integer, Integer, Integer> op) {
        int b = numbers.pop();
        int a = numbers.pop();
        numbers.push(op.apply(a, b));
    }

}