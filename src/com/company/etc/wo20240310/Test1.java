package com.company.etc.wo20240310;

import java.util.Arrays;

public class Test1 {
    public String solution(String[] params) {
        return Arrays.stream(params)
                .map(String::toUpperCase)
                .filter(str -> 5 <= str.length() && str.length() <= 10)
                .findFirst()
                .orElse("없음");
    }
}
