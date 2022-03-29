package com.company.programmers;

import java.util.Arrays;

public class ConnectIsland {
    private int[] vertexes;

    public int solution(int n, int[][] costs) {
        Arrays.sort(costs, (o1, o2) -> {
            Integer a = o1[2];
            Integer b = o2[2];
            return a.compareTo(b);
        });

        vertexes = new int[n];
        for (int i = 0; i < n; i++) {
            vertexes[i] = i;
        }

        int answer = 0;
        for (int[] cost : costs) {
            int from = find(cost[0]);
            int to = find(cost[1]);
            if (from != to) {
                vertexes[to] = from;
                answer += cost[2];
            }
        }
        return answer;
    }

    private int find(int connectedNode) {
        if (vertexes[connectedNode] == connectedNode) {
            return connectedNode;
        }
        return vertexes[connectedNode] = find(vertexes[connectedNode]);
    }
}
