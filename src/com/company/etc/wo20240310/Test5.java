package com.company.etc.wo20240310;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 카드가 2짝수개로 주어질때
 * 원페어가 안되는것들 추려내기
 * 1,1,2,3,5,5 가 있으면 2,3이 리턴되어야 함
 * 1,3,2,1,5,3 이 있으면 2,5가 리턴되어야 함
 */
public class Test5 {
    public int[] solution(int[] card) {
        Arrays.sort(card);

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < card.length - 1; i += 2) {
            if (card[i] != card[i + 1]) {
                if (answer.contains(card[i])) {
                    answer.add(card[i + 1]);
                } else {
                    answer.add(card[i]);
                }
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
