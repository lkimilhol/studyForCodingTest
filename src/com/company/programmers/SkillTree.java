package com.company.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        List<String> list = Arrays.stream(skill.split("")).collect(Collectors.toList());

        for (String s : skill_trees) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (list.contains(Character.toString(s.charAt(i)))) {
                    sb.append(s.charAt(i));
                }
            }
            if (skill.startsWith(sb.toString())) {
                answer++;
            }
        }
        return answer;
    }
}
