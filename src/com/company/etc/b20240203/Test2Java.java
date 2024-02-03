package com.company.etc.b20240203;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class Test2Java {
    public String solution(String str) {
        Deque<Character> jaeum = new ArrayDeque<>();
        Stack<Character> moem = new Stack<>();
        List<Integer> moemIndexes = new ArrayList<>();

        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (isMoem(c)) {
                moem.push(c);
                moemIndexes.add(i);
            } else {
                jaeum.addFirst(c);
            }
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length(); ++i) {
            if (moemIndexes.contains(i)) {
                answer.append(moem.pop());
                continue;
            }

            answer.append(jaeum.getLast());
            jaeum.removeLast();
        }

        return answer.toString();
    }

    private boolean isMoem(Character c) {
        Character[] answer = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        for (char element : answer) {
            if (element == c) {
                return true;
            }
        }
        return false;
    }
}
