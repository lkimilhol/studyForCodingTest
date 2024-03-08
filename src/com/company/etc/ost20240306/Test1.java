package com.company.etc.ost20240306;

import java.util.Arrays;

public class Test1 {
    public int solution(String[] scores) {
        int answer = 0;

        for (String score : scores) {
            if (score.chars().filter(c -> c == 'F').count() >= 2) {
                continue;
            }
            
            if (score.chars().filter(c -> c == 'A').count() >= 2) {
                answer++;
                continue;
            }

            if (calculate(score)) {
                answer++;
            }
        }

        return answer;
    }
    
    private boolean calculate(String score) {
        char[] chars = score.toCharArray();
        Arrays.sort(chars);
        int totalScore = 0;

        for (int i = 1; i < chars.length - 1; i++) {
            switch (chars[i]) {
                case 'A': {
                    totalScore += 5;
                    break;
                }
                case 'B': {
                    totalScore += 4;
                    break;
                }
                case 'C': {
                    totalScore += 3;
                    break;
                }
                case 'D': {
                    totalScore += 2;
                    break;
                }
                case 'E': {
                    totalScore += 1;
                    break;
                }
                default: {}
            }
        }

        double result = (double) totalScore / (chars.length - 2);
        return result >= 3;
    }
}
