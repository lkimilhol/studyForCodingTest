package com.company.codility;

import java.util.Stack;

public class Brackets {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (stack.isEmpty()) {
                stack.add(S.charAt(i));
                continue;
            }

            if ((stack.peek() == '(' && S.charAt(i) == ')')
                    || (stack.peek() == '[' && S.charAt(i) == ']')
                    || (stack.peek() == '{' && S.charAt(i) == '}')){
                stack.pop();
                continue;
            }

            stack.add(S.charAt(i));
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
