package ru.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    @Test
    public void whenStringInputExampleOne() {
        Task3 task3 = new Task3();
        assertEquals(task3.lengthOfLongestSubstring("abcabcbb"), 3);
    }

    @Test
    public void whenStringInputExampleTwo() {
        Task3 task3 = new Task3();
        assertEquals(task3.lengthOfLongestSubstring("bbbbb"), 1);
    }

    @Test
    public void whenStringInputExampleThree() {
        Task3 task3 = new Task3();
        assertEquals(task3.lengthOfLongestSubstring("pwwkew"), 3);
    }

    @Test
    public void whenStringInputExampleFour() {
        Task3 task3 = new Task3();
        assertEquals(task3.lengthOfLongestSubstring("aaabcabcbb"), 3);
    }
}