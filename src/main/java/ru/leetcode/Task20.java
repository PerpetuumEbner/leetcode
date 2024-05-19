package ru.leetcode;

import java.util.Stack;

public class Task20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int index = 0; index < s.length(); index++) {
            char current = s.charAt(index);

            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } else if (current == ')' || current == '}' || current == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char currentTop = stack.pop();
                if ((current == ')' && currentTop != '(') ||
                        (current == '}' && currentTop != '{') ||
                        (current == ']' && currentTop != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
