package ru.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task35Test {

    @Test
    void whenIndex2() {
        Task35 task35 = new Task35();
        int[] nums = new int[]{1, 3, 5, 6};
        assertEquals(task35.searchInsert(nums, 5), 2);
    }

    @Test
    void whenIndex1() {
        Task35 task35 = new Task35();
        int[] nums = new int[]{1, 3, 5, 6};
        assertEquals(task35.searchInsert(nums, 2), 1);
    }

    @Test
    void whenIndex4() {
        Task35 task35 = new Task35();
        int[] nums = new int[]{1, 3, 5, 6};
        assertEquals(task35.searchInsert(nums, 7), 4);
    }
}