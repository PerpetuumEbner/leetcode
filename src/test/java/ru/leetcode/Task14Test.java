package ru.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task14Test {

    @Test
    void whenLongestCommonPrefixFL() {
        Task14 task14 = new Task14();
        String[] strings = {"flower", "flow", "flight"};
        String result = "fl";
        assertEquals(task14.longestCommonPrefix(strings), result);
    }

    @Test
    void whenPrefixNull() {
        Task14 task14 = new Task14();
        String[] strings = {};
        String result = "";
        assertEquals(task14.longestCommonPrefix(strings), result);
    }
}