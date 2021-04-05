package com.company.programmers;

public class NextBigNumber {
    public int solution(int n) {
        int inputCnt = getCount(n);

        while (true) {
            n++;
            if (inputCnt == getCount(n)) {
                break;
            }
        }
        return n;
    }

    private int getCount(int n) {
        int cnt = 0;
        String str = Integer.toBinaryString(n);
        int fromIndex = -1;
        while ((fromIndex = str.indexOf("1", fromIndex + 1)) >= 0) {
            cnt++;
        }
        return cnt;
    }
}
