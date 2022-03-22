package com.company.programmers;

import java.util.*;
import java.util.stream.Collectors;

public class TheHighestAndLowestRanksOfTheLottery {
    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> lottoList = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        List<Integer> winList = Arrays.stream(win_nums).boxed().collect(Collectors.toList());

        int matchCount = (int) lottoList.stream()
                .filter(winList::contains)
                .count();

        int zeroCount = (int) lottoList.stream()
                .filter(number -> number.equals(0))
                .count();

        int maxGrade = matchCount + zeroCount;

        return new int[]{changeResult(maxGrade), changeResult(matchCount)};
    }

    private int changeResult(int count) {
        switch (count) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
