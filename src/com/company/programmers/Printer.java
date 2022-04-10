package com.company.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(priorities[0]);

        while(!queue.isEmpty()) {
        }

        return answer;
    }

    private int top(int[] priorities) {
        int top = 0;

        for (int priority : priorities) {
            top = Math.max(top, priority);
        }

        return top;
    }
}
