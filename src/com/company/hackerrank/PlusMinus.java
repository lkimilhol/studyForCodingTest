package com.company.hackerrank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int countPlus = 0;
        int countMinus = 0;
        int countZero = 0;

        for (Integer i : arr) {
            if (i < 0) {
                countMinus++;
            }
            if (i == 0) {
                countZero++;
            }
            if (i > 0) {
                countPlus++;
            }
        }

        int inputSize = arr.size();

        System.out.println(BigDecimal.valueOf(countPlus).divide(BigDecimal.valueOf(inputSize), 6, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(countMinus).divide(BigDecimal.valueOf(inputSize), 6, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(countZero).divide(BigDecimal.valueOf(inputSize), 6, RoundingMode.HALF_UP));
    }
}
