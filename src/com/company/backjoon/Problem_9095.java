package com.company.backjoon;

import java.util.Scanner;

/*
정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
1+3
3+1
정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 */

//main method에 복사하여 테스트 해볼 것
public class Problem_9095 {
    public static void solution() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[11];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();
            for(int j = 4; j <= input; j++) {
                arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3];
            }
            System.out.println(arr[input]);
        }
    }
}
