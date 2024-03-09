package com.company.hackerrank;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        double center = (double) n / 2;
        boolean isStartClose = false;
        int result = 0;

        if (p <= center) {
            isStartClose = true;
        }

        if (isStartClose) {
            int start = 0;

            while (true) {
                if (p == start || p == start + 1) {
                    return result;
                }

                start += 2;
                result++;
            }
        } else {
            int start = n;
            if (n % 2 == 0) {
                start++;
            }
            while (true) {
                if (p == start || p == start - 1) {
                    return result;
                }

                start -= 2;
                result++;
            }
        }
    }
}
