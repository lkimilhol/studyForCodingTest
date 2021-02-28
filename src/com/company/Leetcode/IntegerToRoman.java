package com.company.Leetcode;

public class IntegerToRoman {
    private static final int I = 1;
    private static final int V = 5;
    private static final int X = 10;
    private static final int L = 50;
    private static final int C = 100;
    private static final int D = 500;
    private static final int M = 1000;

    public static String solution(int num) {
        int total = 0;
        int calc = num;
        StringBuilder ret = new StringBuilder();

        while (total != num) {
            if (calc / M > 0 ) {
                total += M;
                calc -= M;
                ret.append("M");
            }
            else if (calc / D > 0) {
                if (calc >= 900) {
                    total += 900;
                    calc -= 900;
                    ret.append("CM");
                    continue;
                }
                total += 500;
                calc -= 500;
                ret.append("D");
            } else if (calc / C > 0) {
                if (calc >= 400) {
                    total += 400;
                    calc -= 400;
                    ret.append("CD");
                    continue;
                }
                total += 100;
                calc -= 100;
                ret.append("C");
            } else if (calc / L > 0) {
                if (calc >= 90) {
                    total += 90;
                    calc -= 90;
                    ret.append("XC");
                    continue;
                }
                total += 50;
                calc -= 50;
                ret.append("L");
            } else if (calc / X > 0) {
                if (calc >= 40) {
                    total += 40;
                    calc -= 40;
                    ret.append("XL");
                    continue;
                }
                total += 10;
                calc -= 10;
                ret.append("X");
            } else if (calc / V > 0) {
                if (calc >= 9) {
                    total += 9;
                    calc -= 9;
                    ret.append("IX");
                    continue;
                }
                total += 5;
                calc -= 5;
                ret.append("V");
            } else if (calc / I > 0) {
                if (calc >= 4) {
                    total += 4;
                    calc -= 4;
                    ret.append("IV");
                    continue;
                }
                total += 1;
                calc -= 1;
                ret.append("I");
            }
        }

        return ret.toString();
    }
}
