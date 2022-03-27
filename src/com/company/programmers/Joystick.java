package com.company.programmers;

public class Joystick {
    public int solution(String name) {
        int answer = 0;

        int nextA;
        int length = name.length();
        int moveCount = length - 1;

        for (int i = 0; i < name.length(); i++) {
            answer += findCharacter(name, i);

            nextA = i + 1;

            while(nextA < length && name.charAt(nextA) == 'A'){
                nextA++;
            }

            moveCount = Math.min(moveCount, i * 2 + length - nextA);
            moveCount = Math.min(moveCount, (length - nextA) * 2 + i);
        }

        return answer + moveCount;
    }

    private int findCharacter(String name, int i) {
        char c = name.charAt(i);
        int a = c - 'A';
        int b = 'Z' - c + 1;

        return Math.min(a, b);
    }
}
