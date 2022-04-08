package com.company.programmers;

public class Network {
    private int answer = 0;

    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(computers, visited, i);
            }
        }

        return answer;
    }

    public void dfs(int[][] computers, boolean[] visited, int computer) {
        if (visited[computer]) {
            return;
        }

        visited[computer] = true;
        for (int i = 0; i < computers[computer].length; i++) {
            if (computer == i) {
                continue;
            }

            if (computers[computer][i] == 1) {
                dfs(computers, visited, i);
            }
        }
    }
}