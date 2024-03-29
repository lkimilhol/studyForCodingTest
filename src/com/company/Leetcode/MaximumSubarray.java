package com.company.Leetcode;

/*
https://leetcode.com/problems/maximum-subarray/

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 */

public class MaximumSubarray {
    public static int solution(int[] nums) {
        int total = nums[0];
        int subSum = 0;
        for (int num : nums) {
            subSum += num;
            total = Math.max(subSum, total);
            if (subSum < 0)
                subSum = 0;
        }

        return total;
    }
}
