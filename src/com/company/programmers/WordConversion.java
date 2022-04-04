package com.company.programmers;

public class WordConversion {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        boolean[] visit = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            answer += dfs(words[i], target, words, visit, i);
        }

        return answer;
    }

    private int dfs(String begin, String target, String[] words, boolean[] visit, int i) {
        if (visit[i]) {
            return 0;
        }

        if ()
    }

    private boolean isChangeable(String word, String target) {
        int diff = 0;

        for (int i = 0; i < word.length(); i++) {
            diff += word.charAt(i) - target.charAt(i);
        }

        return diff == 1;
    }
}
