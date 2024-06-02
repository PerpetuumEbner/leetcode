package ru.leetcode;

public class Task70 {
    public int climbStairs(int n) {
        if (n == 1) {
            return n;
        }

        int first = 1;
        int second = 2;

        for (int index = 3; index <= n; index++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}