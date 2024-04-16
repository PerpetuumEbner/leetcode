package ru.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task9Test {

    @Test
    void isPalindrome() {
        Task9 task9 = new Task9();
        Assertions.assertTrue(task9.isPalindrome(121));
    }

    @Test
    void isNotPalindrome() {
        Task9 task9 = new Task9();
        Assertions.assertFalse(task9.isPalindrome(-121));
    }

    @Test
    void is10NotPalindrome() {
        Task9 task9 = new Task9();
        Assertions.assertFalse(task9.isPalindrome(10));
    }

    @Test
    void isZeroPalindrome() {
        Task9 task9 = new Task9();
        Assertions.assertTrue(task9.isPalindrome(0));
    }
}