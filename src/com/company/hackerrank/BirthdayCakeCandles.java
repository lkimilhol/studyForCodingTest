package com.company.hackerrank;

import java.util.Comparator;
import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        candles.sort(Comparator.reverseOrder());
        int temp = 0;
        int result = 0;

        for (Integer candle : candles) {
            if (temp == 0) {
                temp = candle;
                result++;
                continue;
            }

            if (temp != candle) {
                break;
            }

            result++;
        }

        return result;
    }
}
