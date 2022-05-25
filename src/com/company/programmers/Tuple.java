package com.company.programmers;

import static java.util.stream.Collectors.groupingBy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tuple {
    public int[] solution(String s) {
        s = s.replace("{", "");
        s = s.replace("}", "");

        Map<String, Long> map = Arrays.stream(s.split(","))
                .collect(groupingBy(Function.identity(), Collectors.counting()));

        List<Map.Entry<String, Long>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort((o1, o2) -> (int) (o2.getValue() - o1.getValue()));

        return entryList.stream()
                .map(i -> Integer.parseInt(i.getKey()))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
