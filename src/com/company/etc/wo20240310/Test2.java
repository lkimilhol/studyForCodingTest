package com.company.etc.wo20240310;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {
    public String solution(String[] leftArray, String[] rightArray) {
        List<String> rightList = Arrays.asList(rightArray);

        return Arrays.stream(leftArray)
                .filter(rightList::contains)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }
}
