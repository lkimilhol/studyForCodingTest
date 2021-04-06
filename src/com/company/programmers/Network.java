package com.company.programmers;

public class Network {
    public int dfs(int i, int[][] computers, boolean[] visit) {
        if (visit[i]) {
            return 0;
        }
        visit[i] = true;
        for (int j = 0; j < computers[i].length; j++) {
            if (computers[i][j] == 1) {
                dfs(j, computers, visit);
            }
        }
        return 1;
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                answer += dfs(i, computers, visit);
            }
        }
        return answer;
    }
}
