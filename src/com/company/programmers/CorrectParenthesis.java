package com.company.programmers;

import java.util.Stack;

public class CorrectParenthesis {
    boolean solution(String s) {
        final char OPEN = '(';

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);

            if (item == OPEN) {
                stack.push(item);
                continue;
            }

            if (stack.empty()) {
                stack.push(item);
                continue;
            }

            char tmp = stack.pop();
            if (tmp != OPEN) {
                stack.push(tmp);
                stack.push(item);
            }
        }

        return stack.empty();
    }
}
