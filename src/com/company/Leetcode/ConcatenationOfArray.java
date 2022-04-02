package com.company.Leetcode;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int index = 0;

        for (int num : nums) {
            result[index] = num;
            result[index + nums.length] = num;
            index++;
        }

        return result;
    }
}
