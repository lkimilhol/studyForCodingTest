package com.company.etc.ost20240306;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test4 {
    public int[] solution(int n, int[] entry) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> rooms = new HashMap<>();

        for (int action : entry) {
            if (action == 0) {
                int roomNumber = findFirstRoom(n, rooms);
                int cnt = rooms.getOrDefault(roomNumber, 0);

                if (cnt < n) {
                    rooms.put(roomNumber, ++cnt);
                } else {
                    rooms.put(++roomNumber, 1);
                }

                answer.add(roomNumber);
            } else {
                Integer cnt = rooms.get(action);
                rooms.put(action, --cnt);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    private int findFirstRoom(int n, Map<Integer, Integer> rooms) {
        if (rooms.isEmpty()) {
            return 1;
        }

        int roomNumber = Integer.MIN_VALUE;
        int cnt = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : rooms.entrySet()) {
            int value = entry.getValue();
            if (value < n && value < cnt) {
                roomNumber = entry.getKey();
                cnt = value;
            }
        }

        if (roomNumber == Integer.MIN_VALUE) {
            roomNumber = rooms.size() + 1;
        }

        return roomNumber;
    }
}

