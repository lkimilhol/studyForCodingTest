package com.company.etc.ost20240306;

import java.util.*;

public class Test2 {
    public int[] solution(int[] ball, int[] order) {
        List<Integer> result = new ArrayList<>();

        Deque<Integer> ballQue = new ArrayDeque<>();
        for (int value : ball) {
            ballQue.add(value);
        }

        List<Integer> temp = new ArrayList<>();

        for (int number : order) {
            if (ballQue.peekFirst() == number) {
                result.add(ballQue.pollFirst());
                checkFirst(ballQue, temp, result);
                continue;
            }

            if (ballQue.peekLast() == number) {
                result.add(ballQue.pollLast());
                checkLast(ballQue, temp, result);
                continue;
            }

            temp.add(number);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private void checkFirst(Deque<Integer> ballQue, List<Integer> temp, List<Integer> result) {
        while (temp.contains(ballQue.peekFirst())) {
            int findNumber = ballQue.pollFirst();
            temp.remove((Integer) findNumber);
            result.add(findNumber);
        }
    }

    private void checkLast(Deque<Integer> ballQue, List<Integer> temp, List<Integer> result) {
        while (temp.contains(ballQue.peekLast())) {
            int findNumber = ballQue.pollLast();
            temp.remove((Integer) findNumber);
            result.add(findNumber);
        }
    }
}
