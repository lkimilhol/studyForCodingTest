package com.company.algorithm;

class Subset {
    public static int check;
    public static int[] checkArr;

    public static void solution(int n) {
        check = n + 1;
        checkArr = new int[n + 1];
        dfs(1);
    }

    public static void dfs(int n) {
        if (n == check) {
            for (int i = 1; i < check; i++) {
                if (checkArr[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            checkArr[n] = 1;
            dfs(n + 1);
            checkArr[n] = 0;
            dfs(n + 1);
        }
    }
}

