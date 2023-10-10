package ru.leetcode;

public class Task66 {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;

        while (digits[index] == 9) {
            if (index == 0) {
                int[] array = new int[digits.length + 1];
                array[index] = 1;
                return array;
            }
            digits[index] = 0;
            index--;
        }

        digits[index] += 1;

        return digits;
    }
}