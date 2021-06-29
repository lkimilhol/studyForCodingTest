package com.company.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int count = 0;

        for (String skill_tree : skill_trees) {
            String reg = "[^" + skill + "]";
            String newStr = skill_tree.replaceAll(reg, "");
            if (skill.startsWith(newStr)) {
                count++;
            }
        }

        return count;
    }
}
