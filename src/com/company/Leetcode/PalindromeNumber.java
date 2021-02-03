package com.company.Leetcode;
/*
https://leetcode.com/problems/palindrome-number/

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.



Example 1:

Input: x = 121
Output: true
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Example 4:

Input: x = -101
Output: false


Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?
 */

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        if (x % 10 == 0) {
            return false;
        }

        int len = 0;
        int tmp = x;

        while (tmp != 0) {
            len++;
            tmp /= 10;
        }

        int j = len / 2;

        for (int i = len - 1; i > 0; i--) {
            if (j <= 0) {break;}
            int a = (x / (int)Math.pow(10, i)) % 10;
            int b = (x / (int) Math.pow(10, len - i - 1)) % 10;

            if (a % 10 == 0) {a = 1;}
            if (b == 0) { b = 1;}


            if (a != b) {
                return false;
            }

            j--;
        }

        return true;
    }
}
