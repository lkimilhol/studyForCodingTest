package com.company.algorithm;

public class Land {
    public static int[][] check;
    public static int depth;
    public static int breadth;
    public static int sol;

    public static int solution(int[][] land) {
        depth = land.length;
        breadth = land[0].length;
        check = new int[depth][breadth];
        dfs(land, 0, 0);
        return sol;
    }

    public static void dfs(int[][] land, int n, int path) {
        if (n == depth) {
            int max = 0;
            for (int i = 0; i < depth; i++) {
                for (int j =0; j< breadth; j++) {
                    if (check[i][j] == 1) {
                        max += land[i][j];
                    }
                }
            }
            if (sol < max) {
                sol = max;
            }
        } else {
            for (int i = 0; i < breadth; i++) {
                if (n > 0 && check[n - 1][i] == 1) {
                    continue;
                }
                check[n][i] = 1;
                dfs(land, n + 1, i);
                check[n][i] = 0;
            }
        }
    }
}
