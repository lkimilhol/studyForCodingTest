package com.company.hackerrank;

import java.util.Scanner;

public class StringReverse {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int length = A.length();

        for (int i = 0; i < length / 2; i++) {
            if (A.charAt(i) == A.charAt(length - i - 1)) {
                continue;
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
