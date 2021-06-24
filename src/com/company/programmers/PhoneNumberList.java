package com.company.programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PhoneNumberList {
    public boolean solution(String[] phone_book) {
        List<String> input = Arrays.asList(phone_book);
        input.sort(Comparator.naturalOrder());

        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i + 1).startsWith(input.get(i))) {
                return false;
            }
        }

        return false;
    }
}
