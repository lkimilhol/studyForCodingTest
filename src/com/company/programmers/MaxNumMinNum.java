package com.company.programmers;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MaxNumMinNum {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }

        list.sort(Comparator.naturalOrder());
        int a = list.get(0);
        list.sort(Comparator.reverseOrder());
        int b = list.get(0);

        return a + " " + b;
    }
}
