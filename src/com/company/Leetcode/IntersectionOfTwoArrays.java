package com.company.Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> result = new HashSet<>();

        for (int i : nums1) {
            for (int i1 : nums2) {
                if (i == i1) {
                    result.add(i);
                }
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
