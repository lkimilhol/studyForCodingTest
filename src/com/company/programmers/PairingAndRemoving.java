package com.company.programmers;

import java.util.Stack;

public class PairingAndRemoving {
    public int solution(String s)
    {
        int length = s.length();
        String[] arr = s.split("");
        int index = 0;

        Stack<String> stack = new Stack<>();

        while (index < length) {
            if (stack.empty()) {
                stack.push(arr[index]);
                index++;
                continue;
            }

            if (stack.lastElement().equals(arr[index])) {
                stack.pop();
                index++;
                continue;
            }

            stack.push(arr[index]);
            index++;
        }
        return stack.empty() ? 1 : 0;
    }
}
