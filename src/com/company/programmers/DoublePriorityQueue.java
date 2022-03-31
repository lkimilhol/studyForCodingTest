package com.company.programmers;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {
        List<Integer> list = new LinkedList<>();

        for (String s : operations) {
            if (s.startsWith("I")) {
                list.add(Integer.parseInt(s.split(" ")[1]));
                list.sort(Comparator.naturalOrder());
                continue;
            }

            if (Integer.parseInt(s.split(" ")[1]) > 0 && list.size() > 0) {
                list.remove(list.size() - 1);
                continue;
            }

            if (list.size() > 0) {
                list.remove(0);
            }
        }

        if (list.size() == 0) {
            return new int[]{0, 0};
        }

        return new int[]{
                list.get(list.size() - 1), list.get(0)
        };
    }
}
