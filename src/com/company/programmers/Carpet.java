package com.company.programmers;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int total = brown + yellow;

        int a = brown / 2;
        int b;

        while (true) {
            if (total % a == 0) {
                b = total / a;
                if ((a - 2) * (b - 2) != yellow) {
                    a--;
                    continue;
                }
                break;
            }

            a--;
        }

        answer[0] = a;
        answer[1] = b;

        return answer;
    }
}
