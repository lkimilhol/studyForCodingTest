package com.company.Leetcode;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int answer = 0;
        boolean[][] visit = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (visit[i][j]) {
                    continue;
                }

                if (grid[i][j] == '0') {
                    visit[i][j] = true;
                    continue;
                }

                answer++;
                dfs(grid, visit, i, j);
            }
        }
        return answer;
    }

    private void dfs(char[][] grid, boolean[][] visit, int x, int y) {
        if (visit[x][y]) {
            return;
        }

        visit[x][y] = true;

        if (grid[x][y] == '1') {
            if (x > 0) {
                dfs(grid, visit, x - 1, y);
            }
            if (y > 0) {
                dfs(grid, visit, x, y - 1);
            }
            if (x < grid.length - 1) {
                dfs(grid, visit, x + 1, y);
            }
            if (y < grid[x].length - 1) {
                dfs(grid, visit, x, y + 1);
            }
        }
    }
}
