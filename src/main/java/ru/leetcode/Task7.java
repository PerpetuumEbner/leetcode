package ru.leetcode;

public class Task7 {
    public int reverse(int x) {
        int number = 0;
        int i = number;
        while (x != 0) {
            int count = x % 10;
            x = x / 10;
            number = i + count;
            i = number * 10;
        }
        return number;
    }
}