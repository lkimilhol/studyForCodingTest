package com.company.programmers;

public class TheNumberOfDecimalsInK {
    public int solution(int n, int k) {
        int answer = 0;
        String[] numbers = conversionToK(n, k).split("0");

        for (String number : numbers) {
            if (number.equals("1") || number.equals("")) {
                continue;
            }

            if (isPrimeNumber(Long.parseLong(number))) {
                answer++;
            }
        }
        return answer;
    }

    private String conversionToK(int decimal, int k) {
        StringBuilder sb = new StringBuilder();

        while (decimal > 0) {
            sb.append(decimal % k);
            decimal /= k;
        }

        return sb.reverse().toString();
    }

    private boolean isPrimeNumber(long n) {
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
