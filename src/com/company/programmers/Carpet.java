package com.company.programmers;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int total = brown + yellow;
        int a = (int) Math.sqrt(total);
        int b = 0;
        while (true) {
            if (total % a == 0) {
                b = total / a;
                if ((a - 2) * (b - 2) != yellow) {
                    a++;
                    continue;
                }
                break;
            }
            a++;
        }
        answer[0] = Math.max(a, b);
        answer[1] = Math.min(a, b);
        return answer;
    }
}
