package com.company.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pre.add(nums[i]);
            post.add(nums[n + i]);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < pre.size(); i++) {
            result.add(pre.get(i));
            result.add(post.get(i));
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
