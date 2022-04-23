package com.company.Leetcode;

import java.util.Set;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Set<String> opens = Set.of("(", "{", "[");
        Stack<String> brackets = new Stack<>();

        String[] inputs = s.split("");

        for (String bracket : inputs) {
            if (opens.contains(bracket)) {
                brackets.push(bracket);
                continue;
            }

            if (brackets.empty()) {
                return false;
            }

            String open = brackets.pop();

            if (!isPair(open, bracket)) {
                return false;
            }
        }

        return brackets.empty();
    }

    private boolean isPair(String open, String close) {
        if (open.equals("(") && close.equals(")")) {
            return true;
        }
        if (open.equals("{") && close.equals("}")) {
            return true;
        }
        if (open.equals("[") && close.equals("]")) {
            return true;
        }
        return false;
    }
}
