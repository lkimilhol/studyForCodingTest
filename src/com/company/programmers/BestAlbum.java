package com.company.programmers;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> playList = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            int play = playList.getOrDefault(genres[i], 0);
            play += plays[i];
            playList.put(genres[i], play);
        }

        List<String> keySetList = new ArrayList<>(playList.keySet());

        Collections.sort(keySetList, (o1, o2) -> (playList.get(o2).compareTo(playList.get(o1))));

        int firstValue = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        int secondValue = 0;

        List<Integer> answer = new ArrayList<>();

        for(String key : keySetList) {
            for (int i = 0; i < genres.length; i++) {
                int value = plays[i];
                if (key.equals(genres[i])) {
                    if (value > firstValue) {
                        secondValue = firstValue;
                        secondIndex = firstIndex;
                        firstValue = value;
                        firstIndex = i;
                        continue;
                    }
                    if (value > secondValue) {
                        secondIndex = i;
                        secondValue = value;
                    }
                }
            }
            answer.add(firstIndex);
            if (secondValue != 0) {
                answer.add(secondIndex);
            }
            firstValue = 0;
            firstIndex = 0;
            secondIndex = 0;
            secondValue = 0;
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
