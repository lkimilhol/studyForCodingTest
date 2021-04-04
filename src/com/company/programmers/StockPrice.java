package com.company.programmers;

import java.util.ArrayList;
import java.util.List;

public class StockPrice {
    public int[] solution(int[] prices) {
        List<Integer> sol = new ArrayList<>();
        int second = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] <= prices[j]) {
                    second++;
                } else {
                    second++;
                    break;
                }
            }

            sol.add(second);
            second = 0;
        }
        return sol.stream().mapToInt(i -> i).toArray();
    }
}
